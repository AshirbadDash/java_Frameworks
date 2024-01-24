package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DisplayTable {

	private static String url = "jdbc:mysql://localhost/kodnest";
	private static String username = "root";
	private static String password = "WASD@1234";

	static void display() throws ClassNotFoundException, SQLException {

		// load connection
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection con = DriverManager.getConnection(url, username, password);

		// prepare sql statement
		String query = "select * from duck";

		// create Statement object
		Statement stmt = con.createStatement();

		ResultSet set = stmt.executeQuery(query);

		while (set.next()) {

			System.out.println(set.getInt(1) + " " + set.getString(2));
		}

		con.close();
	}
}