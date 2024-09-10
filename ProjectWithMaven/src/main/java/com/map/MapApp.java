package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapApp {
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestionId(1);
		q1.setQuestion("what is Java");
	
		Answer answer1=new Answer();
		answer1.setAnswerId(111);
		answer1.setAnswer("Java is programming Language");
		q1.setAnswer(answer1);
		answer1.setQuestion(q1);


		
		Question q2=new Question();
		q2.setQuestionId(2);
		q2.setQuestion("what is Collection framework");
	
		Answer answer2=new Answer();
		answer2.setAnswerId(222);
		answer2.setAnswer("API to work with object is java");
		q2.setAnswer(answer2);
		answer2.setQuestion(q2);
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(q1);
		
		session.save(q2);
		tx.commit();
		
		
		Question getq=(Question) session.get(Question.class, 1);
		System.out.println(getq.getQuestion());
		System.out.println(getq.getAnswer().getAnswer());

		
		
		session.close();
		factory.close();
		
	}
}
