package com.HibernateFirst.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.HibernateFirst.entity.Student;

public class Controller {

	
	public static void main(String[] args) {
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tn=session.beginTransaction();
		
		
		
		
//		Student std=new Student();
//		std.setId(111);
//		std.setMarks(45.4);
//		std.setName("raja");
//		session.save(std);     	
		
		
//		Student std3=new Student(03,623.6,"orefm");
//		
//		session.save(std3); 
		
//		System.out.println("insertrd");
//		tn.commit();

		
//		System.out.println(session.get(Student.class, 2));
		
//		Student stud= (Student)session.get(Student.class, 1);
//		
//		System.out.println(stud.getName());
//		System.out.println(stud.getId());
//		System.out.println(stud.getMarks());   
//	Student stud3= (Student)session.get(Student.class, 2);
//		
//		System.out.println(stud3.getName());
//		System.out.println(stud3.getId());
//		System.out.println(stud3.getMarks());
	
		
//		Student stud= (Student)session.get(Student.class, 1);

		
		
		long tr = (Long) session.createQuery("select count(*) from Student").uniqueResult();
		System.out.println("Total number of records in the database: " + tr);

		// Now you can run your loop
		for ( int i=0; i < tr; i++) {
			Student stud = (Student) session.get(Student.class, i);
			if (stud != null) {
			    System.out.println(" "+stud.getId()+"\t "+stud.getName()+"\t "+stud.getMarks());

			} else {
				i--;
			   continue;
			  
			   
			}
		}
		
		
		
		
		
		
		
		
		
//	    System.out.println("ID \t NAME \t MARKS");
//
//		for(int i =0; i<500; i++) {
//		Student stud = (Student) session.get(Student.class, i);
//		if (stud != null) {
//		    System.out.println(" "+stud.getId()+"\t "+stud.getName()+"\t "+stud.getMarks());
//
//		} else {
//		   continue;
//		}
//		
//		}
		
		
		session.close();

		
	}
	

}
