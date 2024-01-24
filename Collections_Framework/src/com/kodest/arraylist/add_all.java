package com.kodest.arraylist;

import java.util.ArrayList;

public class add_all {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Rohit");
		al.add("Virat");
		al.add("Dhoni");
		System.out.println(al);

		ArrayList al2 = new ArrayList();

		al2.add("Messi");
		al2.add("Ronaldo");

		System.out.println(al2);

		ArrayList al3 = new ArrayList();

		al3.addAll(al2);
		al3.addAll(al2);

		System.out.println(al3);

	}

}
