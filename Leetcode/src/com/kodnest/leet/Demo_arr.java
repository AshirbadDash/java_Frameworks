package com.kodnest.leet;

import java.util.ArrayList;

public class Demo_arr {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 'a', 11 };
		for (int ele : arr) {
			System.out.println(ele);
		}

		ArrayList al = new ArrayList();
		al.add(1);
		al.add(1);
		al.add("AShirbad");
		al.add(null);
		al.add(12.123);
		al.add('a');

		System.out.println(al);

	}

}
