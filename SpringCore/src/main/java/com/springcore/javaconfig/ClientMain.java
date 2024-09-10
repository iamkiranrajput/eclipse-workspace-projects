package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stud = context.getBean("getStudent", Student.class);
//		System.out.println(stud);
		stud.study();
		System.out.println(stud.getName());
		
//		Samosa s= context.getBean("samosa",Samosa.class);
//		s.display();
	}

}
