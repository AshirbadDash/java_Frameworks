package com.kodnest.hibernate.Hibernate_project;

import org.hibernate.Session;





import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session + "sucess");

	}
}