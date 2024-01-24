package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Comparisons {
	public static void main(String[] args) {

		Student s1 = new Student(1, "a");
		Student s2 = new Student(57, "b");
		Student s3 = new Student(99, "c");
		Student s4 = new Student(34, "c");
		Student s5 = new Student(23, "d");

		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);

		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);

	}
}

class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override	
	public String toString() {
		return id + "-" + name;

	}

	@Override
	public int compareTo(Student o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else
			return 0; // comparing id

		// comparing name
//		if (this.name.compareTo(o.name) > 0) {
//			return 1;
//		} else if (this.name.compareTo(o.name) < 0) {
//			return -1;
//		} else
//			return 0;

	}
}
