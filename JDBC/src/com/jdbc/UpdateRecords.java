package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("ritik hello");

		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String userName = "root";
		String Password = "WASD@1234";

		Connection con = DriverManager.getConnection(url, userName, Password);
		System.out.println(con + " connected sucessfully");

		Statement stmt = con.createStatement();

		String query = "update student set name ='spidey' where id=4";

		int count = stmt.executeUpdate(query);

		// execute returns a boolean value
		// execute returns the count of total no of rows updated as int

		System.out.println(count + " rows are getting effected");

		System.out.println("sucess");

		con.close();
	}

}
