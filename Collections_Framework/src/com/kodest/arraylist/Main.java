package com.kodest.arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10);
		al.add('a');
		al.add(40.9);
		al.add("string");
		al.add(null);
		System.out.println(al);

	}

}
