package com.constructor;

public class Student {
	
	int roll;
	String name;
	double marks;
	Student(int roll,String name, double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		System.out.println(name+" "+roll+" "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student(12,"raj",98);
		s1.display();
	}
}
