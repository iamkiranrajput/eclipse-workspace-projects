package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static  Connection con;

	public static Connection connect() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String user="root";
		String password="8888";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		
		con=DriverManager.getConnection(url,user,password);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
