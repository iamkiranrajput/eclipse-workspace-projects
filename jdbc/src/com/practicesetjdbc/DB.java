package com.practicesetjdbc;
import java.sql.Connection;

import java.sql.DriverManager;



public class DB {
	static Connection con;
	
	public static Connection config() {
		try {
		// driver loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load");
		
		// connection creation
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "8888";
		
		con = DriverManager.getConnection(url,username,password);
		
		System.out.println("connection created");
		} catch(Exception e) {}
		
		return con;
	}
}
