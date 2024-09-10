package com.OneToManyHibernate.services;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToManyHibernate.entity.Answer;
import com.OneToManyHibernate.entity.Question;


public class Main 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory factory = con.buildSessionFactory();

        
        //creating question
        Question q1 = new Question();
        q1.setQid(107);
        q1.setQ("java is python");
        
        
        //creating answers
        Answer a1 = new Answer();
        a1.setAnsId(11);
        a1.setA("java is Programming language");
        a1.setQuestion(q1);
        
        Answer a2 = new Answer();
        a2.setAnsId(12);
        a2.setA("java is interpreter language");
        a2.setQuestion(q1);
        
        Answer a3 = new Answer();
        a3.setAnsId(13);
        a3.setA("java is robust and Secured language");
        a3.setQuestion(q1);
        
        Answer a4 = new Answer();
        a4.setAnsId(14);
        a4.setA("java is high level programming language");
        a4.setQuestion(q1);
        
        
        Answer a5 = new Answer();
        a5.setAnsId(15);
        a5.setA("java is high level programming language");
        a5.setQuestion(q1);
        
        
        List<Answer>list=new ArrayList<Answer>();
        list.add(a5);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        q1.setAns(list);
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(q1);
        session.save(a2);
        session.save(a3);
        session.save(a4);
        session.save(a5);


        
        transaction.commit();
        session.close();
        factory.close();
    }
}