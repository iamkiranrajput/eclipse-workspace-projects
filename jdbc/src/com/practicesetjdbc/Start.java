package com.practicesetjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username=s.next();
		
		System.out.println("Enter Password");
		String password=s.next();
		
		if(insert(username,password)) {
			System.out.print("success");
		}

	}
	
	public static boolean insert(String username,String password) {
		
		boolean flag=false;
		try {
		Connection con=Config.createCon();
		String Query="Insert into login (username,password) values(?,?)";
		
		PreparedStatement ps=con.prepareStatement(Query);
		
		ps.setString(1,username);
		ps.setString(2, password);
		ps.execute();
		
		flag= true;

		}catch(Exception e) {e.printStackTrace();}
		
		return flag;
		
	}
}
