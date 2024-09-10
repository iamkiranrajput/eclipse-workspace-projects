package com.jdbc;

public class Connect {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("driver loaded");
		
		String url=	"jdbc:mysql://localhost:3306/";
		
		
	}
}
