package com.springcore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/sterio/sterioconfig.xml");
			Student s= (Student)  context.getBean("ob");
			System.out.println(s);
			System.out.println(s.getAddress());
			System.out.println(s.getAddress().getClass().getName());
			
			
			System.out.println(s.hashCode());  //it giving same hashcode it is singletone object
			Student s1= (Student)  context.getBean("ob");
			System.out.println(s1.hashCode());
			
			Teacher t= context.getBean("teacher", Teacher.class);
			System.out.println(t.hashCode());
			Teacher t2= context.getBean("teacher", Teacher.class);
			System.out.println(t2.hashCode());
			
	}	

}
