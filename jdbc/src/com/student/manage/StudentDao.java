package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDao {
	public static boolean insertStudent(Student st) {
		
		boolean f=false;
		try {
		Connection con=CP.connect();
		
		String q="insert into studentdata (sname,sphone,scity) values(?,?,?)";
		
		PreparedStatement pstm= con.prepareStatement(q);
		
//		System.out.println(st.getStudentName());
		pstm.setString(1, st.getStudentName());
		pstm.setString(2, st.getStudentPhone());
		pstm.setString(3, st.getStudentCity());
		
		pstm.execute();
		f=true;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
