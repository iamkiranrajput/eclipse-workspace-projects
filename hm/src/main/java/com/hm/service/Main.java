package com.hm.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hm.entity.Answer;
import com.hm.entity.Question;

public class Main {
    public static void main(String[] args) {
     
       
		Configuration con= new Configuration();
		
       con.configure("hmOneToOne.xml");
       
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tn=session.beginTransaction();
       
       
       Question q1 = new Question();
       q1.setQId(100);
       q1.setQue("what is Java");
       
       Question q2 = new Question();
       q2.setQId(101);
       q2.setQue("What is xml");
       
       Answer a1 = new Answer();
       a1.setAns_id(1);
       a1.setAns("Java is Programming Language");
       q1.setAns(a1);
       a1.setQue(q1);
       
       Answer a2 = new Answer();
       a2.setAns_id(2);
       a2.setAns("it is Extensible markup language");
       q2.setAns(a2);
       a2.setQue(q2);
       
       session.save(q1);
       session.save(q2);
        
//       session.save(q1);
//       session.save(q2);
//       
       tn.commit();
       session.close();
    }
}




