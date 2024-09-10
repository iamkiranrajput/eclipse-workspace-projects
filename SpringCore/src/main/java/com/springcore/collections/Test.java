package com.springcore.collections;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1=(Emp) context.getBean("Emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhones().getClass().getName());
		System.out.println(emp1.getProps());
		
//		Object[] phone=emp1.getPhones().toArray();
//		System.out.println(phone[0]);
		
//		for (Object phone : emp1.getPhones()) {
//		    System.out.println(phone);
//		}
		
//		for(Object entry: emp1.getProps().entrySet()){
//			System.out.println(entry);
//		}
		
		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("driver loaded");
//		String user=emp1.getProps().getProperty("user");
//		String password=emp1.getProps().getProperty("password");
//		String url="jdbc:mysql://localhost:3306/"+emp1.getProps().getProperty("dbName");
//		DriverManager.getConnection(url, user, password);
	
	}
	
}
