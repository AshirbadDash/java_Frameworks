package com.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsert {
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
		String query1 = "Insert into bank values(1,'SBI',500000)";
		String query2 = "Insert into bank values(2,'IDFC',200000)";
		String query3 = "Insert into bank values(3,'KOTAC',100000)";
		String query4 = "Insert into bank values(4,'ANDHRA',300000)";
		String query5 = "Insert into bank values(5,'UNION',400000)";

		// creating statement object
		Statement stmt = con.createStatement();

		// creating the batch
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		stmt.addBatch(query4);
		stmt.addBatch(query5);

		// executing the batch
		stmt.executeBatch();

		System.out.println("insertion completed....");

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
