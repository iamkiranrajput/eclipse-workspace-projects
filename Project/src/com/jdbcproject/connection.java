package com.jdbcproject;
import java.sql.*;

public class connection {
	public static void main(String[] args) throws SQLException {
		
		String query="select * from ragistration";
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmyshow","root","");
		
		System.out.println("connected");
		
		Statement st=con.createStatement();	
		
		
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("UserPass");
		
		System.out.println(name);
		
		}

}
