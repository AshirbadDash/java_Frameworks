package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.manytomany.Customer;
import com.kodnest.manytomany.Product;

public class AppManytomany {

	// private static List<Customer> al2;

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

			Product p2 = new Product();
			p2.setPid(2);
			p2.setPname("prod-2");

			ArrayList<Product> al = new ArrayList<>();
			al.add(p1);
			al.add(p2);

			Customer c1 = new Customer();
			c1.setCid(1);
			c1.setCname("john");
			c1.setP(al);

			Customer c2 = new Customer();
			c2.setCid(2);
			c2.setCname("jack");
			c2.setP(al);


			ArrayList<Customer> al2 = new ArrayList<Customer>();
			al2.add(c1);
			al2.add(c2);
			p1.setC(al2);
			p2.setC(al2);

			session.save(p1);
			session.save(p2);
			session.save(c1);
			session.save(c2);
			tr.commit(); // commit
			
			
		
			
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			session.close();
			factory.close();
		}

	}
}
