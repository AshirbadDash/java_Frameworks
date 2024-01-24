package com.kodnest.al;

class Student {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// Override toString
	@Override
	public String toString() {
		return "Student{name: " + name + " , age:" + age + "}";
	}
}

public class Student_tostring_Ovveride {
	public static void main(String[] args) {

		Student s = new Student(10, "john");
		System.out.println(s);

		Student s2 = new Student(20, "jack");

		System.out.println(s2);

	}
}
