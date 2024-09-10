package com.jdbc;

import java.sql.*;

public class connection {
	
    public static void main(String[] args) throws SQLException {

//    	String sql="insert into student(id,username,mobile,pass)values(6,'raju',888704,'pass12')";
    	
    	String sql="create database studeee11";
    	
        String url="jdbc:mysql://localhost:3306";
        String username="root";
        String password="";
        
    
        Connection con= DriverManager.getConnection(url,username,password);
   
    	  System.out.println("connected");
        
        
        Statement st=con.createStatement();
//        st.executeUpdate(sql);
        
//        System.out.print(st.executeUpdate(sql));
        
        
       
        try {
        if(st.executeUpdate(sql)==1) {
        	System.out.println("query successfull run");
        }else {
        	System.out.println("somthing goes wrong");
        }
        }catch(Exception e) {
        	System.out.println("something goes wrong "+e.getMessage());
        }
        
        
    	
    	
    	
    	
    	
//        String sql="select * from student";
//        String url="jdbc:mysql://localhost:3306/demo";
//        String username="root";
//        String password="";
//    
//         Connection con= DriverManager.getConnection(url,username,password);
//         Statement st=con.createStatement();
//         ResultSet rs=st.executeQuery(sql);
//         rs.next();
//
//         String name=rs.getString(3);
//
//         System.out.print(name);
    }
}
