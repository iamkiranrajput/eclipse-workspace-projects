package com.multicatch;

public class ThrowException {
	public void ageverify( int age) {
		if(age<18 && age>0) {
//			System.out.println("");
			throw new ArithmeticException("You are not Eligible");
		}else if(age<0) {
			throw new NullPointerException("Age shoulld  be greater then 18");
		}
		
		else {
			System.out.println("you are eligible for vote ");
		}
		
	}
	
	
	public static void main(String[] args) {
		ThrowException e=new ThrowException();
		
		e.ageverify(14);
	}

}
