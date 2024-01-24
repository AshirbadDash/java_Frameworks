package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
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

		stmt.execute("create table student (id int,name varchar(20))");


	}

}


