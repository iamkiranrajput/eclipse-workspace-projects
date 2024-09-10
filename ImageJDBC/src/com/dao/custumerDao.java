package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class custumerDao {
	
	
	public static boolean insert(CustumerInfo c1) throws SQLException, FileNotFoundException {
		Connection con=Connector.connect();
		String q="insert into custinfo(id,name,pic) values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(q);
				
		// data passing to database
		ps.setInt(1, c1.getId());
		ps.setString(2, c1.getName());
//		ps.setString(3,c1.getPic());
		
		File newFile = new File(c1.getPic());

//	    File newFile = new File(nfile);  // Directly reference the file in the same directory
        FileInputStream fin = new FileInputStream(newFile);
        ps.setBinaryStream(3, fin);

        ps.executeUpdate();
//		File newFile= new File("/download.jfif");

//		File newFile= new File("C://Users//rajpu//OneDrive//Pictures//download.jfif");
//		File newFile=new File("\"C:\\Users\\rajpu\\OneDrive\\Pictures\\download.jfif\"");
		
//		FileInputStream fin =new FileInputStream(newFile);
//		
//		ps.setBinaryStream(3, fin);
//		ps.executeUpdate();
		
		return true;
	}
}
