package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;
import tutorial.Students;

public class HQLPAgination {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		Query q=s.createQuery("from Students");
		
		//implementing pagination in using hibernate
		q.setFirstResult(2); 
		q.setMaxResults(6);
		
		List<Students> list= q.getResultList();
		
		
		for(Students st:list) {
			System.out.println(st.getId()+":"+st.getName());
		}
		
		s.close();
		factory.close();
	}
}
