package com.constructor;

public class Operation {
	Operation(int a , int b){
		System.out.println(a+b);
	}
	
	Operation(int a , double b){
		System.out.println(a-b);
	}	
	
	Operation(double a , int b){
		System.out.println(a+b);
	}
	
	Operation(double a , double b){
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Operation a=new Operation(23,20);
		Operation a1=new Operation(2.3,33);
		Operation a2=new Operation(23,11.1);
		Operation a3=new Operation(3.0,2.2);
	}
}
