package com.kodnest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {

			// user credentials
			String url = "jdbc:mysql://localhost/kodnest";
			String username = "root";
			String password = "WASD@1234";

			// taking input
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your id ");
			int id = sc.nextInt();

			System.out.println("Enter your name ");
			String name = sc.next();
			sc.close();

			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish connection
			Connection con = DriverManager.getConnection(url, username, password);

			con.setAutoCommit(false);

			// creating SQL query
			String query = "insert into student (id,name)values(?,?)";

			// creating prepared statement
			PreparedStatement ps = con.prepareStatement(query);

			// Set the values
			ps.setInt(1, id);
			ps.setString(2, name);

			int count = ps.executeUpdate();

			con.commit();
			System.out.println("No of rows affected are " + count);
			con.close();

		} catch (Exception e) {
//			con.rollback();
			System.out.println("Exception handled");
			e.printStackTrace();

		}
	}
}
