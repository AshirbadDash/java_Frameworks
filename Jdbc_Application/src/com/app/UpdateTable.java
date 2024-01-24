package com.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class UpdateTable {

	final private static String url = ("jdbc:mysql://localhost/kodnest");
	final private static String username = ("root");
	final private static String password = ("WASD@1234");

	static void update() throws ClassNotFoundException, SQLException {

		// load connection
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection con = DriverManager.getConnection(url, username, password);

		// prepare sql statement

		String query = "update duck set name='ashirbad' where id =1";

		// create Statement object
		Statement stmt = con.createStatement();

		int count = stmt.executeUpdate(query);

		System.out.println("the no of rows being updated are " + count);

		if (count > 0) {

			System.out.println("Updation Sucess....");
		} else {
			System.out.println("Updation Failure");
		}

		con.close();

	}

}
