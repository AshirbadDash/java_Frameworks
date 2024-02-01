package com.kodnest.veichles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Veichle veichle = context.getBean("myVeichle", Veichle.class);
		System.out.println(veichle.getMileage());

	}

}
