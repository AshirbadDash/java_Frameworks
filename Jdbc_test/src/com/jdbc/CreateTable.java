package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class CreateTable {
	private static String url = "jdbc:mysql://localhost/kodnest";
	private static String username = "root";
	private static String password = "WASD@1234";

	public static void create() throws ClassNotFoundException, SQLException {

		// load driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("connected sucessfully");

		// prepare the sql statement
		String query = "create table if not exists duck(id int ,name VARCHAR(20))";

		// create statement object
		Statement stmt = con.createStatement();

		stmt.execute(query);

		System.out.println();

		con.close();

	}
}