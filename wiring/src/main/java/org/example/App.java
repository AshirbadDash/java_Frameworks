package org.example;

import org.bean.School;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		School school = (School) context.getBean("s1");

		System.out.println(school);

	}
}
