package com.list;

import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		LinkedList <Integer> ll= new LinkedList<>();

		ll.add(1);
		ll.add(22);
		ll.add(44);
		ll.add(1);
		System.out.println(ll);		System.out.println(ll);
		
		ll.add(2, 23423);		//adding index at 2
		
		System.out.println(ll);
		
		LinkedList <Integer> a= new LinkedList<>();
	
		a.get(0);
//		a=(LinkedList<Integer>) ll.clone();
//		System.out.println(a);
//		Object a1=ll.clone();
//		System.out.println(a1);
		
//		ll.lastIndexOf();
		System.out.println(ll.lastIndexOf(1));
		
		
		

		
	}
	
}
