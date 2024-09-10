package com.methods;
import java.util.*;

public class StudentResult {
	Scanner sc=new Scanner(System.in);
	String studClass;
	int studId;
	String studName;
	String[] subName=new String[5];
	int[] subMarks=new int[5];
	double total,marksAdd;


	void info(){
		
		System.out.println("Enter your Name: ");
		studName=sc.nextLine();
		System.out.println("Enter your class");
		studClass=sc.nextLine();
		System.out.println("Enter Student Id");
		studId=sc.nextInt();
		
	}
	void marks() {
		for(int i=0; i<subName.length; i++) {
		
			System.out.println("Enter your subject name : ");
			subName[i]=sc.next();
			System.out.println("Enter "+subName[i]+" subject marks : ");
			subMarks[i]=sc.nextInt();
		}
	}
	void marksCalc() {
		for(int marks:subMarks) 
			marksAdd+=marks;
		
		total=marksAdd/5;
	}
	
	void printInfo() {
		System.out.println(" Your name is "+studName+" ID is "+studId+" and Class is "+studClass);
		System.out.println(" Your Percentage is:"+total);
	}
	public static void main(String[] args) {
		StudentResult karn= new StudentResult();
		karn.info();
		karn.marks();
		karn.marksCalc();
		karn.printInfo();
		
	}
	
}
