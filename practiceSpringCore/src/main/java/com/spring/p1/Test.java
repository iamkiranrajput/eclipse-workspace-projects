package com.spring.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

		College c =context.getBean("college", College.class);
		System.out.println(c.getS1());
		System.out.println(c.getCollegeName());
	}

}
