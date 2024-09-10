package com.codecon;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class studentdao {
	static boolean t = true;
	
	public static boolean insert(Student s1) throws Exception {
		Connection con = connection.createConnection();
		
		String g = "insert into studenttable(regno,name,peercentage)values(?,?,?)";
		
		// data passing to database
		PreparedStatement ps = con.prepareStatement(g);
		ps.setInt(1, s1.getReg_no());
		ps.setString(2, s1.getName());
		ps.setInt(3, (int) s1.getPercentage());
		
		
//		File newFile= new File("C:/Users/rajpu/OneDrive/Pictures/download.jfif");
		
//		FileInputStream fin =new FileInputStream(newFile);
		
//		ps.setBinaryStream(1, fin);
	
		
		ps.executeUpdate();
		return t;
	}

}