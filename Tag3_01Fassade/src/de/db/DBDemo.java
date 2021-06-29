package de.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/gothaer?user=root&password=yop49JZ";
	private static final String SELECT_STATEMENT = "select * from tbl_personen";
	private static final String FORMAT_STRING = "%-40s";

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(CONNECTION_STRING)) {
			try (Statement statement = connection.createStatement()) {

				try (ResultSet resultSet = statement.executeQuery(SELECT_STATEMENT)) {
					ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
					
					for(int column = 1; column <= resultSetMetaData.getColumnCount(); column ++) {
						System.out.printf(FORMAT_STRING, resultSetMetaData.getColumnName(column));
					}
					System.out.println();
					
					while(resultSet.next()) {
						for(int column = 1; column <= resultSetMetaData.getColumnCount(); column ++) {
							System.out.printf(FORMAT_STRING, resultSet.getString(column));
						}
						System.out.println();
					}

				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
