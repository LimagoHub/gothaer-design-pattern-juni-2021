package de.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Table implements AutoCloseable{
	private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/gothaer?user=root&password=yop49JZ";

	private final String selectString;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;
	private int columnCount = -1;
	private Map<String, String> row = null;

	public Table(String selectString) {
		this.selectString = selectString;
	}
	
	public String getColumnName(int column) throws Exception {
		return getResultSetMetaData().getColumnName(column + 1); // Zählweise korrigieren
	}

	public String getColumnValue(int column) throws Exception {
		return getColumnValue(getColumnName(column));
	}

	public String getColumnValue(String columnName) throws Exception {
		return getRow().get(columnName);
	}

	public boolean next() throws Exception {
		if(getResultSet().next()) {
			populateRow();
			return true;
		}
		return false;
	}
	
	public int getColumnCount()  throws Exception{
		if(columnCount < 0) {
			columnCount = getResultSetMetaData().getColumnCount();
		}
		return columnCount;
	}
	

	private void populateRow() throws Exception{
		for(int column = 0; column < getColumnCount(); column ++) {
			getRow().put(getColumnName(column), getResultSet().getString(getColumnName(column)));
		}
		
	}


	private Connection getConnection()  throws Exception{
		if(connection == null)
			connection = DriverManager.getConnection(CONNECTION_STRING);
		return connection;
	}



	private Statement getStatement()  throws Exception{
		if(statement == null)
			statement = getConnection().createStatement();
		return statement;
	}

	private ResultSet getResultSet()  throws Exception{
		if(resultSet == null) {
			resultSet = getStatement().executeQuery(selectString);
		}
		return resultSet;
	}

	private ResultSetMetaData getResultSetMetaData()  throws Exception{
		if(resultSetMetaData == null)
			resultSetMetaData = getResultSet().getMetaData();
		return resultSetMetaData;
	}

	private Map<String, String> getRow() throws Exception{
		if(row == null) {
			row = new HashMap<>();
		}
		return row;
	}



	@Override
	public void close() throws Exception {
		if(resultSet != null) resultSet.close();
		if(statement != null) statement.close();
		if(connection != null) connection.close();
		
	}
	
	


}
