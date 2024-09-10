package com.exception;

public class FirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1st line");
		
		System.out.println("2nd Line");
		
		try
		{
			double d = 10/0;
			
			System.out.println(d);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		System.out.println("3rd Line");

	}

}
