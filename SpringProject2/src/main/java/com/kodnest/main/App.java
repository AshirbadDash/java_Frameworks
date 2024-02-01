package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Laptop l1 = context.getBean("l1",Laptop.class);
		Laptop l2 = (Laptop) context.getBean("l2");
//		Laptop l3 = (Laptop) context.getBean("l3");
//		Laptop l4 = (Laptop) context.getBean("l4");

		System.out.println(l1);
		System.out.println(l2);
//		System.out.println(l3);
//		System.out.println(l4);

	}

}
