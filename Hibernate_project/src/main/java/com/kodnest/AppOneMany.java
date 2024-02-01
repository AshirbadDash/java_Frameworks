package com.kodnest;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.onetomany.Customer;
import com.kodnest.onetomany.Product;

public class AppOneMany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session + "sucess");

		try {

			Transaction tr = session.beginTransaction();// transaction started

			Product p1 = new Product();

			p1.setPid(1);
			p1.setPname("prod-1");
			session.save(p1);

			Product p2 = new Product();
			p2.setPid(2);
			p2.setPname("prod-2");
			session.save(p2);

			ArrayList<Product> al = new ArrayList<>();
			al.add(p1);
			al.add(p2);

			Customer c = new Customer(1, "john", al);
			session.save(c);

			tr.commit(); // commit
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			session.close();
			factory.close();
		}

	}
}
