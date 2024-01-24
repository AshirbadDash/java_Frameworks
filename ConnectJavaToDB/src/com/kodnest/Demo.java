package com.kodnest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

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
			String query = "insert into employee values(1,'john')";

			// execute the query
			int count = stmt.executeUpdate(query);

			System.out.println("the no of rows being updated are " + count);

			if (count > 0) {

				System.out.println("Insertion Sucessfully....");
			}
		} catch (Exception e) {
			System.out.println("Insertion Failure....");

			e.printStackTrace();

		} finally {
			con.close();
		}

	}
}