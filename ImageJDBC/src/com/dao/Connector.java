package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	
	static Connection con;
	
	public static Connection connect(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		String user="root";
		String pass="8888";
		String url="jdbc:mysql://localhost:3306/customer";
		
		con=DriverManager.getConnection(url,user,pass);

		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;

	}
	

}
