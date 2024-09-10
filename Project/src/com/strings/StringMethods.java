package com.strings;

public class StringMethods {
	public static void main(String[] args) {
		String a="India";
		String b= new String();
		b="   Maha rashtra";
		String c="mahara shtra";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.toUpperCase());
		System.out.println("is Empty "+a.isEmpty());
		System.out.println(" is contains "+a.contains("H"));
		System.out.println(a.contentEquals(a));
		System.out.println(a.toLowerCase());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.compareTo(b));

		System.out.println(a.startsWith("m"));
//		System.out.println(a.split("mah"));
		System.out.println(a.split(c, 3));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		String[] ab=b.split("r",2);
		System.out.println(ab[1]);
		System.out.println(b.trim()); //remove the spaces of starting of words and eding of words  "   word   "=word
			
		}
		

		
	}

