package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");

		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// connection information
		String url = "jdbc:mysql://localhost/kodnest";
		String userName = "root";
		String Password = "WASD@1234";

		// Executing the SQL statement
		String query = "insert into student values(?,?)";

		// Establishing connection
		Connection con = DriverManager.getConnection(url, userName, Password);

		System.out.println(con + " connected sucessfully");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		int id = sc.nextInt();

		System.out.println("Enter the name");
		String name = sc.next();

		// creating the statement
		PreparedStatement stmt = con.prepareStatement(query);

		stmt.setInt(1, id);
		stmt.setString(2, name);

		int executeUpdate = stmt.executeUpdate();
		System.out.println("sucess");
		con.close();
	}

}
