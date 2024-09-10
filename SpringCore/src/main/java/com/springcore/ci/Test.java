package com.springcore.ci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p);

//		ArrayList<String> str=new ArrayList<String>(p.list);
//		System.out.println(str.get(0));
//		System.out.println(p.list.get(4));
		
		Addition add=(Addition) context.getBean("add");
		add.doSum();
	}
}
