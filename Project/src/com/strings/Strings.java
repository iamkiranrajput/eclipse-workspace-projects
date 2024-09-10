package com.strings;

public class Strings {
	public static void main(String[] args) {
		String s1="Kiran";
		String s2="Kiran";
		String s3=new String("Kiran");
		System.out.println();
		
		int a= System.identityHashCode(s3);
		int b= System.identityHashCode(s1);
		int c= System.identityHashCode(s2);
		System.out.println(a+"\n"+b+"\n"+c);

	}
}
