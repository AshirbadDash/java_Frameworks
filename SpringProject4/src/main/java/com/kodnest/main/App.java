package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.beans.Trainer;
import com.kodnest.beans.University;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
	Trainer t=(Trainer)context.getBean("t1");
	University u=(University)context.getBean("u1");
	
	System.out.println(t);
	System.out.println(u);
		
	}

}
