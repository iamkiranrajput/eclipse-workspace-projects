package com.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
//import com.dao.CustumerInfo;


public class Start {
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		
//		CustumerInfo c=new CustumerInfo();
//		Connection con=custumerDao.insert(c);

		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter your Id");
		int id=s.nextInt();
		
		System.out.println("Enter your Name");
		String name=s.next();
		System.out.println("Enter your pic");
		String pic=s.next();
		
		CustumerInfo c1= new CustumerInfo(id,name,pic);
		boolean ans = custumerDao.insert(c1);

		
		if (ans) {
			System.out.println("Data inserted sucessfully");
		}else {
			System.out.println("insert correct data");
		}

	}
}
