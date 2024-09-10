package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		Samosa s1 =(Samosa) context.getBean("s1");
		System.out.println(s1);
		
		//registring shutdown hook
		context.registerShutdownHook();
//		System.out.println("===========================");
//		
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		Vadapav v1=(Vadapav)context.getBean("v1");
		System.out.println(v1);
	}
	
	
	

}
