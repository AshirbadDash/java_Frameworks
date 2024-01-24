package com.kodnest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	static String url = "jdbc:mysql://localhost/kodnest";
	static String uname = "root";
	static String password = "WASD@1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// create the connection
		Connection con = DriverManager.getConnection(url, uname, password);
		try {

			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create statement
			Statement stmt = con.createStatement();

			// sql query
			String query = "create table if not exists employee(id int,name varchar(20))";

			// execute the query
			boolean count = stmt.execute(query);

			if (count) {

				System.out.println("Table created  Sucessfully....");
			} else {
				System.out.println("Table already exists");
			}
		} catch (Exception e) {
			System.out.println("Table creation Failure....");

			e.printStackTrace();

		} finally {
			con.close();
		}

	}
}