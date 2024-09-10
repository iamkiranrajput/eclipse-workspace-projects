package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyMapping {
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
//		Question q1=new Question();
//		q1.setQuestionId(9199);
//		q1.setQuestion("what is Java");
//	
//		Answer answer1=new Answer();
//		answer1.setAnswerId(111);
//		answer1.setAnswer("Java is programming Language");
//		answer1.setQuestion(q1);
//		
//		Answer answer2=new Answer();
//		answer2.setAnswerId(112);
//		answer2.setAnswer("With the help of java we can build software");
//		answer2.setQuestion(q1);
//		
//		Answer answer3=new Answer();
//		answer3.setAnswerId(113);
//		answer3.setAnswer("Java has different types of framework");
//		answer3.setQuestion(q1);
//
//		List<Answer> list= new ArrayList<Answer>();
//		
//		q1.setAnswer(list);
		
		

		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
//		session.save(q1);
//		session.save(answer1);
//		session.save(answer2);
//		session.save(answer3);

		tx.commit();
		
		Question q=(Question) session.get(Question.class,9199);
		System.out.println(q.getQuestion());
		
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
			
		session.close();
		factory.close();
		
	}
}
