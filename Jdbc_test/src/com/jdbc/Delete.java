package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Delete {

	final private static String url = ("jdbc:mysql://localhost/kodnest");
	final private static String username = ("root");
	final private static String password = ("WASD@1234");

	public static void delete() throws ClassNotFoundException, SQLException {

		// load connection
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection con = DriverManager.getConnection(url, username, password);

		// prepare sql statement

		String query = "Delete from duck where id=1";

		// create Statement object
		Statement stmt = con.createStatement();

		int count = stmt.executeUpdate(query);

		System.out.println("the no of rows being updated are " + count);

		if (count > 0) {

			System.out.println("Deleteted Sucessfully....");
		} else {
			System.out.println("Deletion Failure");
		}

		con.close();

	}

}
