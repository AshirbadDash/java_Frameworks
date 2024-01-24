package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String userName = "root";
		String Password = "WASD@1234";

		Connection con = DriverManager.getConnection(url, userName, Password);
		System.out.println(con + " connected sucessfully");

		Statement stmt = con.createStatement();

		String query = "select * from student where id>3";

		ResultSet rs = stmt.executeQuery(query);
		// result set is the table fetched as result from SQL as object
		// next() will return boolean value

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}

		System.out.println("sucess");

		con.close();

	}

}
