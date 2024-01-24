package com.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("ritik hello");

		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost/kodnest";
		String userName = "root";
		String Password = "WASD@1234";

























        
		Connection con = DriverManager.getConnection(url, userName, Password);
		System.out.println(con + " connected sucessfully");

		// Prepare the SQL statement
		String sql = "UPDATE student SET name = ? WHERE id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);

		// Get user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student ID:");
		int id = scanner.nextInt();
		System.out.println("Enter new name:");
		String name = scanner.next();

		// Set the values
		pstmt.setString(1, name);
		pstmt.setInt(2, id);

		// Execute the statement
		int count = pstmt.executeUpdate();

		System.out.println(count + " rows are getting effected");

		System.out.println("success");

		con.close();
	}

}