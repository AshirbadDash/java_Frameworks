package com.Bank;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
	private final static String url = "jdbc:mysql://localhost/kodnest";
	private final static String name = "root";
	private final static String password = "WASD@1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;

		// prepare SQL statement
		String query1 = "update bank set balance=balance-5000 where acc_no=1";
		String query2 = "updat bank set balance=balance+5000 where acc_no=2";
		// create connection
		try {
			con = DriverManager.getConnection(url, name, password);
			System.out.println("connected sucessfully");

			con.setAutoCommit(false);

			// creating statement object
			Statement stmt = con.createStatement();

			// creating the batch for incrementing the balance by +5000

			stmt.addBatch(query1);
			stmt.addBatch(query2);

			// executing the batch
			System.out.println("     Processing......");
			Thread.sleep(2000);

			stmt.executeBatch();

			con.commit();
			System.out.println("     Transaction completed....");

		} catch (Exception e) {
			System.out.println("     Transaction failed");
			con.rollback();
			System.out.println("Exiting ......");
			System.exit(0);

		} finally {

			con.close();
		}

	}

}
