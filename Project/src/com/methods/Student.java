package com.methods;

public class Student {
	void play(String name) {
//		System.out.println("\t\t_________"+name+"_________");
		System.out.println(name+" is playing...");
		
	}
	void learn(String name) {
//		System.out.println("\t\t_________"+name+"_________");
		System.out.println(name+" is learning...");
	}
	void code(String name) {
//		System.out.println("\t\t_________"+name+"_________");
		System.out.println(name+" is coding...");
	}
	void watch(String name) {
//		System.out.println("\t\t_________"+name+"_________");
		System.out.println(name+" is Watching movies...");
	}
	void read(String name) {
//		System.out.println("\t\t_________"+name+"_________");
		System.out.println(name+" is Reading Books...");
	}
	public double marks(double a, double b, double c) {
			return (a+b+c)/3;
		}
	
	public static void main(String[] args) {
		
		Student s=new Student();
//		s.play("yash");
//		s.read("yash");
////		Student raj=new Student();
//		s.learn("raj");
////		Student ameya=new Student();
//		s.play("ameya");
//		s.learn("ameya");
//		
//		Student jay=new Student();
//		s.watch("jay");
//		s.read("jay");
//		s.code("Raj");
		
		double per=s.marks(45.5,35.5,33.3);
		System.out.println(per);
		
		
	}
}
