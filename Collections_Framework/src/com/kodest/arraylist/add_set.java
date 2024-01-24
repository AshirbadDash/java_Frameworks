package com.kodest.arraylist;

import java.util.ArrayList;

public class add_set {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Virat");
		al.add("Dhoni");
		al.add("Rohit");
		al.add(0, "peter");
		System.out.println(al);
		al.set(0, "Sachin");
		System.out.println(al);

	}

}
