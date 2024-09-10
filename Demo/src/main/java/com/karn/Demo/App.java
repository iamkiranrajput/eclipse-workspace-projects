package com.karn.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	Alien kiran=new Alien();
    	kiran.setAid(101);
    	kiran.setAname("kiran");
    	kiran.setColor("green");
    	
    	Configuration con =new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	
    	SessionFactory sf= con.buildSessionFactory();
    	
    	Session se= sf.openSession();
    	
    	Transaction t=se.beginTransaction();
    	
    	se.save(kiran);
    	t.commit();
    	
    	
    	
    }
}
