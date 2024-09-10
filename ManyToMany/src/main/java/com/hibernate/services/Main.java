package com.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;
import com.hibernate.entity.Project;

public class Main {

	public static void main(String[] args) {

		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Karn");
		
		Employee e2=new Employee();
		e2.setEid(201);
		e2.setEname("Raju");
		
		Employee e3=new Employee();
		e3.setEid(301);
		e3.setEname("Arsh");
		
	
		
		Project p1=new Project();
		p1.setPid(11);
		p1.setPname("Web Development");
		
		
		
		Project p2=new Project();
		p2.setPid(22);
		p2.setPname("App Development");
		
		Project p3=new Project();
		p3.setPid(33);
		p3.setPname("UI/UX Development");
		
		Project p4=new Project();
		p4.setPid(44);
		p4.setPname("React Development");
		
		
		Project p5=new Project();
		p5.setPid(55);
		p5.setPname("Anguler Development");
		
	
		List<Employee> elist =new ArrayList<>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		List<Project> plist =new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);

		
	
	



		
		e1.setProjects(plist);
		p1.setEmployee(elist);
		e2.setProjects(plist);
		p2.setEmployee(elist);
		p3.setEmployee(elist);
		e3.setProjects(plist);

		
		
		
		
		
		
		
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(e1);
		session.save(p1);
		session.save(e2);
		session.save(p2);
		session.save(p3);
		session.save(e3);
		
		t.commit();
		session.close();
		sf.close();
		
		
		
		
		
		

		
		
	}

}
