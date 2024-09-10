package com.exception;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Raj";
		String b = "Karale";
		String c = null;
		String d = "india";
		
		System.out.println(a.contains(a));
		System.out.println(d);
		System.out.println(b.length());
		try 
		{
			System.out.println(c.length());
		}catch(NullPointerException A)
		{
			System.out.println("Exception handlled");
			System.out.println(A);
		}
		System.out.println(d.charAt(3));

	}

}
