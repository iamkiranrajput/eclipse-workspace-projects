package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import tutorial.Students;

public class FirstCacheDemo {
		public static void main(String[] args) {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session s= factory.openSession();
			
			//by default enable
			
			
			Students student= s.get(Students.class, 101);
			System.out.println(student);
			System.out.println("working something");
			
			Students student2=s.get(Students.class, 101);
			System.out.println(student2); //when i tring  to retrive the data same id the data is stored in cache memory and it will never fire the query again this is csll first level cahche
			Transaction tx= s.beginTransaction();
	
//			Students s2= new Students();
//			s2.setCity("dsfgdfgdfgdgdghgoidkg");
//			s2.setId(3463);
//			s2.setName("fdgjkdghdfklghdflgjkdfjdgl");
//			s.save(s2);
//			
//			s.delete(s2);
//			tx.commit();
		
			System.out.println(s.contains(student2)); // its return true or false   // to check the what data is stored in cache is chache object is stored in cache its return the true
			s.close();

			Session s2=factory.openSession(); //if you closed first session it wil never store the data in second session
			
			System.out.println(s2.contains(student2)); // its return false because we are creaated second session it doesent stroed the cache both session work independently 
			s2.close();

		}
}
