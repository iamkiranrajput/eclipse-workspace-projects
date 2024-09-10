package com.codecon;

import java.util.Scanner;

public class start {
	static boolean t = true;
       public static void main(String[] args) throws Exception {
		
    	   
    	  try {
    	System.out.println("welcome...!!");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("press 1 for ADD Student");
			System.out.println("press 2 for delete Student");
			System.out.println("press 3 for update Student");
			System.out.println("press 4 for exit Student");
			
			int c= sc.nextInt();
			if(c==1) {
				System.out.println("Enter student ID");
				int reg_no=sc.nextInt();
				
				System.out.println("Enter Student name");
				String name=sc.next();
				
				System.out.println("Enter Student percentage");
				double percentage= sc.nextDouble();
				
				// object to store a data.
				Student s1= new Student(reg_no, name, percentage);
				boolean ans = studentdao.insert(s1);
				
				if (ans == t) {
					System.out.println("Data inserted sucessfully");
				}else {
					System.out.println("insert correct data");
				}	
				
			}
			
		}
		
    	  }catch(Exception e) {
    		  System.out.println(e);
    	  }
    	   
    	   
	}
}