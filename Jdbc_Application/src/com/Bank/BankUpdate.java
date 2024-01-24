package com.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankUpdate {
	private final static String url = "jdbc:mysql://localhost/kodnest";
	private final static String name = "root";
	private final static String password = "WASD@1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection con = DriverManager.getConnection(url, name, password);
		System.out.println("connected sucessfully");

		// prepare SQL statement
		String query1 = "update bank set balance=balance+5000 where acc_no=1";
		String query2 = "update bank set balance=balance+5000 where acc_no=2";
		String query3 = "update bank set balance=balance+5000 where acc_no=3";
		String query4 = "update bank set balance=balance+5000 where acc_no=4";
		String query5 = "update bank set balance=balance+5000 where acc_no=5";

		// creating statement object
		Statement stmt = con.createStatement();

		// creating the batch for incrementing the balance by +5000
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		stmt.addBatch(query4);
		stmt.addBatch(query5);

		// executing the batch
		stmt.executeBatch();

		System.out.println("updation  completed....");

//
//		System.out.println("modified " + count + " no of rows");
//
//		if (count > 0) {
//
//			System.out.println("insertion completed....");
//		} else {
//			System.out.println("Insertion Failure");
//		}

		con.close();

	}

}
