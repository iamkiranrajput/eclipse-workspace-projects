package com.hql;

import java.util.Arrays;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import tutorial.Students;

import jakarta.persistence.Query;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session s=factory.openSession();
	
		
		
//		to get the query
		
//		String query="from Students";
//		String query="from Students where city='vaijapur'";
		
//		String query="from Students where city=:x";
//		String query="from Students as s where s.city=:x and s.name=:n";

//		 Query q=s.createQuery(query);
//		 q.setParameter("x", "vaijapur");
		 
//		 q.setParameter("x", "vaijapur");
//		 q.setParameter("n", "jay");
		
		
		//single -(unique)
		 //multiple-list 
//		 List<Students> list=q.getResultList();
//		 for(Students student:list) {
//			 System.out.println(student.getCity()+"\t"+ student.getName());
//		 }	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Transaction tx=s.beginTransaction();
		 // Delete Quaery
//		 Query q2=s.createQuery("delete from Students as s where s,city=:c");
//		 q2.setParameter("c", "jaypur");

		 
		 //update Query
//		 Query q3=s.createQuery("update Students set city=:c where name=:n");
//		 q3.setParameter("n", "jay");
//		 q3.setParameter("c", "Sambhajinagar");

		 tx.commit(); 

		 
		 
		 
//		 how to join the two tables
		 
		 Query q4= s.createQuery("select q.question , q.questionId,a.answer from Question as q INNER JOIN q.answer as a ");
		 List<Object []> list3=q4.getResultList();
		 
		 for(Object[] arr:list3) {
			 System.out.println(Arrays.toString(arr));
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		s.close();
		factory.close();
	}
}




