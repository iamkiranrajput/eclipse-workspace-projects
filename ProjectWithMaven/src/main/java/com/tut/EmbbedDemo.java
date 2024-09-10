package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbbedDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student student1 = new Student();
		student1.setId(111);
		student1.setName("kiran");
		student1.setCity("Sambhajinagar");

		Certificate certificate = new Certificate();
		certificate.setCourse("React");
		certificate.setDuration("2 months");
		student1.setCerti(certificate);

		Student student2 = new Student();
		student2.setName("raj");
		student2.setId(121);
		student2.setCity("Dharashiv");

		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Java");
		certificate2.setDuration("4 months");
		student2.setCerti(certificate2);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(student1);
		s.save(student2);

		tx.commit();
		s.close();
		factory.close();

	}
}
