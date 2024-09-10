package com.demo;

public class StaticClass {
	

	static{
		System.out.println("for this sttic block no need to create the object it will always run");
	}
	
	 {
		System.out.println("this block run when the object is created ");
	}
	
	public static void main(String[] args) {
		
//		StaticClass s=new StaticClass();
		 {
			System.out.println("this run automatically no need to perform further operation");
		}
	}
}
