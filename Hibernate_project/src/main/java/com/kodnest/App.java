package com.kodnest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.onetoone.Customer;
import com.kodnest.onetoone.Product;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// System.out.println(session + "sucess");

		try {

			Transaction tr = session.beginTransaction();// transaction started
			// Student s = new Student(1, "jack");
			// session.save(s);// insertion of records using save()

			// System.out.println(student.getId() + "-" + student.getName());
			//
			// using toString ()
			// Student student = session.get(Student.class, 1);
			// System.out.println(student);
			// Bike b = new Bike("ktm", 500000);
			// session.save(b);// insertion of records using save()

			// List<Student> list = session.createQuery("from Student where id").list();
			//
			// for (Student student : list) {
			// System.out.println(student);
			// }

			Product p1 = new Product();
			p1.setPid(3);
			p1.setPname("dell");

			// p.setCustomer(c);

			Customer c1 = new Customer();
			c1.setId(1);
			c1.setName("jack");
			p1.setCustomer(c1);
			c1.setProduct(p1);
			session.save(p1);
			session.save(c1);

			Product p2 = new Product();
			p2.setPid(4);
			p2.setPname("hp");

			Customer c2 = new Customer();
			c2.setId(2);
			c2.setName("jill");
			p2.setCustomer(c2);
			c2.setProduct(p2);
			session.save(p2);
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
