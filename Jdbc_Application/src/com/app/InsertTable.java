package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class InsertTable {
	private final static String url = "jdbc:mysql://localhost/kodnest";
	private final static String name = "root";
	private final static String password = "WASD@1234";

	public static void insert() throws ClassNotFoundException, SQLException {

		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection con = DriverManager.getConnection(url, name, password);
		System.out.println("connected sucessfully");

		// prepare sql statement
		String query = "Insert into duck values(1,'one')";

		// creating statement object
		Statement stmt = con.createStatement();

		// executing the query
		int count = stmt.executeUpdate(query);

		System.out.println("modified " + count + " no of rows");

		if (count > 0) {

			System.out.println("insertion completed....");
		} else {
			System.out.println("Insertion Failure");
		}

		con.close();

	}

}
