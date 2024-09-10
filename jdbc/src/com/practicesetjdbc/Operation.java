package com.practicesetjdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operation {

	static Connection con=DB.config();
	static Scanner sc=new Scanner(System.in);
	
	static void DropDatabase() {
		try {
			System.out.println("\t\t-----------------------------\n \t\t Select Database to Drop \n\t\t-----------------------------");
			showDatabases();
			while(true) {
			System.out.println("\t\t-------------------------\n \t\t Enter Database Name \n\t\t-------------------------");

			String sdb=sc.next();
			String query="drop database "+sdb;
		    Statement cs = con.createStatement();
			cs.executeUpdate(query);
			System.out.println("Database Dropped");
			
			System.out.println("\t\t------------------------------------------\n\t\t do you want to delete One More Database (Y/N) \n\t\t------------------------------------------");
			String s=sc.next();
		       if(s.equalsIgnoreCase("N"))
		    		   break;
			}
		}catch(Exception e) {System.out.println("\n \t\t-------------------------------------------------\n \t\t"+e.getMessage()+"\n \t\t-------------------------------------------------");}
	}



	static void dropTable() {

		try {
			System.out.println("\t\t-----------------------------\n \t\t Select Database First \n\t\t-----------------------------");
			showDatabases();
			System.out.println("\t\t-------------------------\n \t\t Enter Database Name \n\t\t-------------------------");
			String sdb=sc.next();
			useDatabase(sdb);
			while(true) {
			if(showTables())
				break;
			
			System.out.println("\t\t-------------------------------\n \t\t Enter Table Name to Drop \n\t\t-------------------------------");
			
			String query="drop table "+sc.next();
		    Statement cs = con.createStatement();
			cs.executeUpdate(query);
			
			System.out.println("Table Dropped");
			
			System.out.println("\t\t------------------------------------------\n\t\t do you want to delete One More Tables (Y/N) \n\t\t------------------------------------------");
			String s=sc.next();
		       if(s.equalsIgnoreCase("N"))
		    		   break;
			}
		}catch(Exception e) {System.out.println("\n \t\t-------------------------------------------------\n\t\t"+e.getMessage()+"\n \t\t-------------------------------------------------");}
	
	}
	

public static void fetch() throws SQLException {
		
		showTables();
		System.out.println("Enter table name");
		String tbName=sc.next();
		String query="SELECT * FROM "+tbName;
		
		Statement ps=con.createStatement();
		ResultSet rs=ps.executeQuery(query);
		
	
		int i=1;
		 while(rs.next()) {
	        	
	        	String data=rs.getString("name");
	        	String data1=rs.getString("age");
	        	String data2=rs.getString("city");
	        	String data3=rs.getString("roll");
	        	String data4=rs.getString("id");


	        	System.out.print("\t\t "+data+"\t"+data1+"\t"+data2+"\t"+data3+"\t"+data4+"\n"); 	
	        	i++;
	        }
	        if(i==1) {
	        	System.out.println("\t\t------------------ \n\t\t Database Empty \n\t\t------------------");
	        }
	}

	
	
	public static boolean showTables() throws SQLException {
		System.out.println("\t\t Enter database name");
		String dbName1=sc.next();
		useDatabase(dbName1);
		String query="show tables";
        Statement cs = con.createStatement();
        ResultSet result = cs.executeQuery(query);
        int i=1;
        while(result.next()) {
        	
        	String tbName=result.getString(1);
        	System.out.println("\t\t "+i+"."+tbName); 	
        	i++;
        }
        if(i==1) {
        	System.out.println("\t\t------------------ \n\t\t Database Empty \n\t\t------------------");
        	
        	return true;
        }
        return false;
	}

	
	public static void deleteData() {
		
		try {
		showTables();
		
		System.out.println("\t\t Enter Table Name ");
		String tbName=sc.next();
		
		System.out.println("\t\t Enter Condition");
		String condition=sc.next();
		
		String query="DELETE FROM "+tbName+" WHERE "+condition;
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.executeUpdate();
		
		System.out.println("Query Executed");
		}catch(Exception e) {System.out.println(e.getMessage());}
	}

	public static Object updateData() {
		return null;
	}

	
	
	public static void insertData() throws SQLException {
//		System.out.println("\t\t-------------------\n \t\t Select Database \n\t\t-------------------");
//		showDatabases();
		System.out.println("\t\t-------------------------\n \t\t Enter Database Name \n\t\t-------------------------");

		String sdb=sc.next();
		useDatabase(sdb);
		
		
				System.out.println("\n\t\t Enter Table Name:");	
				String tbName=sc.next();
		while(true) {
			try {
				System.out.println("\t\t Number of column");
		        int columns = sc.nextInt(); 
	
		        StringBuilder query = new StringBuilder("INSERT INTO ").append(tbName).append(" VALUES(");
		        for (int i = 1; i <= columns; i++) {
		        	System.out.println("\t\t Enter values "+i);
		        	String values=sc.next();
		        	
		        	query.append("'").append(values).append("' , "); 

		        }
		        
		        query.setLength(query.length() - 2);
		        
		        query.append(")");
		        String query1 = query.toString();
		        	PreparedStatement ps = con.prepareStatement(query1);
		            ps.executeUpdate();
				
		            
		       System.out.println("\t\t------------------------------------------\n \t\t do you want to Insert more Data (Y/N) \n \t\t-----------------------------------------");
		       String s=sc.next();
		       if(s.equalsIgnoreCase("N"))
		    		   break;
		       
			}catch(Exception e) {System.out.println("\n\t\t----------------------------------------------\n\t\t"+e.getMessage()+"\n\t\t----------------------------------------------");}
		}
		
		
	}

	
	 public static void createDatabase() {
		try {
			System.out.println("\t\t-------------------------\n \t\t Enter Database Name \n\t\t-------------------------");
			String dbName=sc.next();
			String query="create database "+dbName;		
	        Statement st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Database Created");
		}catch(Exception e) {System.out.println("\n\t\t----------------------------------------------\n\t\t"+e.getMessage()+"\n\t\t----------------------------------------------");}
	 }
	 
	 
	 
	public static void createTable() throws SQLException {
			System.out.println("\t\t-------------------\n \t\t Select Database \n\t\t-------------------");
			showDatabases();
			System.out.println("\t\t-------------------------\n \t\t Enter Database Name \n\t\t-------------------------");

			String sdb=sc.next();
				useDatabase(sdb);
				
				while(true) {
					try {
						System.out.println("\n\t\t Enter Table Name:");	
						String tbName=sc.next();
						System.out.println("\t\t Number of column");
				        int columns = sc.nextInt(); 
			
				        StringBuilder query = new StringBuilder("create table ").append(tbName).append(" (");
				        for (int i = 1; i <= columns; i++) {
				        	System.out.println("\t\t Enter column Name "+i);
				        	String cName=sc.next();
				            query.append(cName).append(" varchar(255), "); 
				        }
				        
				        query.setLength(query.length() - 2);
				        query.append(")");
				        String query1 = query.toString();
				        	PreparedStatement ps = con.prepareStatement(query1);
				            ps.executeUpdate();
						
				        
				            
				       System.out.println("\t\t------------------------------------------\n \t\t do you want to create more table (Y/N) \n \t\t-----------------------------------------");
				       String s=sc.next();
				       if(s.equalsIgnoreCase("N"))
				    		   break;
				       
					}catch(Exception e) {System.out.println("\n\t\t----------------------------------------------\n\t\t"+e.getMessage()+"\n\t\t----------------------------------------------");}
				}
	}

	public static void useDatabase(String dbname) throws SQLException {
		
		String query="use "+dbname;
        Statement cs = con.createStatement();
		cs.executeQuery(query);
	}


	public static void showDatabases() throws SQLException {
		String query="show databases";
        Statement cs = con.createStatement();
        ResultSet result = cs.executeQuery(query);
        int i=1;
        while(result.next()) {
        	
        	String dbName=result.getString(1);
        	System.out.println("\t\t "+i+"."+dbName); 	
        	i++;
        }

	}
	
	
	
}
