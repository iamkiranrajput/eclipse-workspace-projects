package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StatesDemo {
	
	public static void main(String[] args) {
		
		//Trasient
		//Persistent
		//Detached
		//Removed
		
		
		System.out.println("example");
		
		
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Student s1 =new Student();
			s1.setId(121);
			s1.setCerti(new Certificate("java hibernate course", "2 month"));
//			student :trasient 
			
			
			Session s=f.openSession();
			Transaction tx=s.beginTransaction();
//			s.save(s1);
			
			
//			student :Persistent - associated with session,database 
		
			s1.setName("John");
			
//			s.delete(s1);
//			removed state
			
			tx.commit();
			s.close();
			
//			student detached
			s1.setName("sachin"); // it will not update in database this is detached state
			
//			when we delete the data fromm database it is removed state
		
		f.close();
	}

}
