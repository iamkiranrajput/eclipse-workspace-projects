package com.practicesetjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Config {
	static Connection con;
	public static Connection createCon() throws SQLException {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		
		String user="root";
		String pass="8888";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		String q="create table login (id int primary key auto_increment, username varchar(23), password varchar(22))";
	
		
		con=DriverManager.getConnection(url,user,pass);
		Statement st= con.createStatement();
		st.executeUpdate(q);
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
}
