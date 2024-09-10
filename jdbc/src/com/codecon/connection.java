package com.codecon;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	
	static Connection con;
	
	public static Connection createConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load");
		String url = "jdbc:mysql://localhost:3306/studentinfo";
		String username = "root";
		String password = "8888";
		
		con = DriverManager.getConnection(url,username,password);
		
		System.out.println("connection created");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	
//	
//	 static Connection createConnection1() {
//		 try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 System.out.println("Driver loaded");
//			 
//			 String url1="jdbc:mysql://localhost:3306/studentinfo";
//			 
//			 String username="root";
//			 String pas="8888";
//			 con =DriverManager.getConnection(url1,username,pas);
//			 			 
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		return con;
//		
//	}

}
	
