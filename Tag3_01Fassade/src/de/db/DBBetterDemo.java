package de.db;

public class DBBetterDemo {
	
	private static final String FORMAT_STRING = "%-40s|";
	private static final String SELECT_STATEMENT = "select * from tbl_personen";

	public static void main(String[] args) throws Exception{

		try(Table table = new Table(SELECT_STATEMENT)) {
			
			
			for(int column = 0; column < table.getColumnCount(); column ++) {
				System.out.printf(FORMAT_STRING, table.getColumnName(column).toUpperCase());
			}
			System.out.println("\n" + "-".repeat(120));

			while(table.next()) {
				for(int column = 0; column < table.getColumnCount(); column ++) {
					System.out.printf(FORMAT_STRING, table.getColumnValue(column));
				}
				System.out.println();

			}
			
		}

	}

}
