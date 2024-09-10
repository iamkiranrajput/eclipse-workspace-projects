package com.student.manage;

import com.student.manage.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1 to Add");
			System.out.println("2 to Delete");
			System.out.println("3 to Display");
			System.out.println("4 to Exit");
			int c=Integer.parseInt(br.readLine());
			
			
			
			
			if(c==1) {
				System.out.println("Enter User Name:");
				String name=br.readLine();
				
				
				System.out.println("Enter Phone No:");
				String phone=br.readLine();
				
				System.out.println("Enter User City:");
				String city=br.readLine();
				
//				Student st=new Student(name,phone,city);
//				System.out.println(st);
				
				
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudent(st);
				if(answer) {
					System.out.println("success");
				}
				else {
					System.out.println("something wrong");
				}
				
//				System.out.println(st);
				
				
			}else if(c==2) {
				
			}else if(c==3) {
				
			}else if(c==4) {
				break;
			}
			else {
				
			}	
			
		}
		
		System.out.println("THANKS FOR UASING MY applicatoin bye bye...");
		
		
		
	}
}
