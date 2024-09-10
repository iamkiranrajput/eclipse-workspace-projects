package com.practicesetjdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.practicesetjdbc.Operation;


public class SQLWorkbench {
	static Scanner sc=new Scanner(System.in);

	
	public static void main(String[] args) throws SQLException {
		 Operation op=new Operation();

		System.out.println(" welcome");
		try {
		while(true) {
			System.out.println("\n\n \t which Operation you Want to perforom \n \t\t 1.Create Database \n \t\t 2.Drop Database \n \t\t 3.Create Table \n \t\t 4.Drop Table \n \t\t 5.Insert Data \n \t\t 6.Update Data \n \t\t 7.Delete Data \n \t\t 8.Fetch Data \n \t\t 9.Exit \n \t\t 10.Show Databases \n \t\t 11.Show Tables");
			int num=sc.nextInt();
			
			if(num==1)
				op.createDatabase();
			else if(num==2)
				op.DropDatabase();
			else if(num==3)
				op.createTable();
			else if(num==4)
				op.dropTable();
			else if(num==5)
				op.insertData();
			else if(num==6)
				op.updateData();
			else if(num==7)
				op.deleteData();
			else if(num==8) {
				op.fetch();
			}
			else if(num==9)
				break;
			else if(num==10)
				op.showDatabases();
			else if(num==11)
				op.showTables();
			else System.out.println("\t\t-------------- \n \t\t invalid choice \n \t\t--------------");
			}	
		}catch(Exception e) {System.out.println("\n \t\t---------------------------\n \t\t "+e.getMessage()+" \n \t\t---------------------------");}
			System.out.println("Thanks for using Apana SQL Workbench");

	}

			
	}
