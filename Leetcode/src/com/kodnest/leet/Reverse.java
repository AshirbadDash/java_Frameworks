package com.kodnest.leet;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		ReverseNumber l1 = new ReverseNumber();
		l1.fun2(num);
		sc.close();

	}
}
