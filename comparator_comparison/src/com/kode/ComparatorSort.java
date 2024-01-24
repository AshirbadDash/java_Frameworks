package com.kode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSort {
	public static void main(String[] args) {

		student s1 = new student(1, "a");
		student s2 = new student(57, "b");
		student s3 = new student(99, "c");
		student s4 = new student(34, "d");
		student s5 = new student(23, "e");

		ArrayList<student> arrayList = new ArrayList<>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);

		System.out.println(arrayList);
		Collections.sort(arrayList, new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				if (o1.id > o2.id) {
					return 1;
				} else if (o1.id < o2.id) {
					return -1;
				} else
					return 0;
			}
		});
		System.out.println(arrayList);

	}
}

class student {
	int id;
	String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "-" + name;

	}

}
