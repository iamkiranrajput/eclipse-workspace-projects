package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		int id=1;
		String sql="Update student2 set fees_pending=0 where id="+id;
        String url="jdbc:mysql://localhost:3306/student2";
        String username="root";
        String password="8888";
        
        Connection con= DriverManager.getConnection(url,username,password);
    	  System.out.println("connected");
        
        Statement st=con.createStatement();
        st.executeQuery(sql);

	}
}
