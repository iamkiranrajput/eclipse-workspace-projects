package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();

		e1.setEid(23);
		e1.setName("kiran");
		
		e2.setEid(21);
		e2.setName("sham");
		
		
		
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(111);
		p1.setProjectName("eccomerce app");
		
		p2.setPid(222);
		p2.setProjectName("Chatbot");
		
		
		
		List<Employee> elist1=new ArrayList<>();
		List<Project> plist1=new ArrayList<>();

		elist1.add(e1);
		elist1.add(e2);
		
		
		plist1.add(p1);
		plist1.add(p2);
		
		
		
		e1.setProjects(plist1);
		p1.setEmps(elist1);
		
		
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		
		session.save(p1);
		session.save(p2);
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
	}
}	
