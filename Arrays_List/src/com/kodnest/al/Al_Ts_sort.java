package com.kodnest.al;

import java.util.ArrayList;
import java.util.Collections;

public class Al_Ts_sort {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(50);

		System.out.println(al);
//	TreeSet ts = new TreeSet();
		Collections.sort(al);// it will sort without removing the duplicate value
		System.out.println(al);

	}
}
