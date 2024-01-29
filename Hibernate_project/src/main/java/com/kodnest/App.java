package com.kodnest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
//		System.out.println(session + "sucess");

		Transaction tr = session.beginTransaction();// transaction started
//		Student s = new Student(1, "jack");
//		session.save(s);// insertion of records using save()

//		System.out.println(student.getId() + "-" + student.getName());
//		
		// using toString ()
//		Student student = session.get(Student.class, 1);
//		System.out.println(student);
//		Bike b = new Bike("ktm", 500000);
//		session.save(b);// insertion of records using save()

//		List<Student> list = session.createQuery("from Student where id").list();
//
//		for (Student student : list) {
//			System.out.println(student);
//		}

		Bike bike = new Bike("KTM", 3);

		session.save(bike);
		Student student = new Student(1, "john", bike);
		session.save(student);

		tr.commit(); // commit
		session.close();
		factory.close();
	}
}







