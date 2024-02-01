package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.MultipleEmployees;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		/*
		 * Employee e1 = (Employee) context.getBean("e1"); System.out.println(e1);
		 */

		MultipleEmployees me = (MultipleEmployees) context.getBean("me1");
		System.out.println(me);

		context.close();
		

	}

}
