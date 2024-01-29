package com.kodnest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectionQuery {

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
			String query = "select * from employee where id=1";

			// execute the query
			ResultSet set = stmt.executeQuery(query);
//
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2));
//			}
//			System.out.println("sucess");

			while (set.next()) {

				System.out.println(set.getInt(1) + " " + set.getString(2));
			}

		} catch (Exception e) {
			System.out.println("Display Failure....");

			e.printStackTrace();

		} finally {
			con.close();
		}

	}
}