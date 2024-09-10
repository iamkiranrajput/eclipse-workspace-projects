package com.list;

import java.util.LinkedList;

public class linklist2 {

	public static void main(String[] args) {
		LinkedList <String> a= new  LinkedList<>();
		a.add(null);
		a.add("hello");
		a.add(2,"Kiran");
		System.out.println(a);
		
		a.addFirst("1223");
		
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		a.remove("1223");
//		a.remove(6);   //its  gisves an errror arrau index out of bounds
		System.out.println(a);

		String ab="22";
		a.add(ab);
		System.out.println(a);
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		
//		System.out.println("abc"+1+2+3);
//		System.out.println(1+2+3+"abc");
//		System.out.println(123+'a'+'b'+1);
//		System.out.println(123+3+1+"abc");

	}
}
