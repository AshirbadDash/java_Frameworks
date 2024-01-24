package com.app;

import java.sql.SQLException;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {

		System.out.println("APPLICATION STARTED");
		DisplayTable.display();

		while (true) {

			System.out.println("------------------------------------");
			System.out.println("Enter the operation you want to perform");
			System.out.println("1. Create Table");
			System.out.println("2. Insert Table");
			System.out.println("3. Update Table");
			System.out.println("4. Delete Table");
			System.out.println("5. Application Ended");
			System.out.println("------------------------------------");

			Thread.sleep(3000);

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			System.out.println("Enter your choice");

			switch (choice) {
			case 1:
				CreateTable.create();
				DisplayTable.display();
				break;
			case 2:
				InsertTable.insert();
				DisplayTable.display();
				break;
			case 3:
				UpdateTable.update();
				DisplayTable.display();
				break;
			case 4:
				Delete.delete();
				DisplayTable.display();
				break;
			case 5:
				Exit.exit();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}
}
