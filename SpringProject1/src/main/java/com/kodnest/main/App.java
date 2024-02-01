package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Spring-Framework");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Student s = (Student) context.getBean("s1");
		System.out.println(s);

	}

}
