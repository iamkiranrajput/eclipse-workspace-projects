package com.list;

import java.util.ArrayDeque;
//import java.util.Deque;

public class DequeEx {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad= new ArrayDeque<>();
		
		ad.add(435);
		ad.add(123);
		ad.add(435);
		ad.add(435);
		ad.add(123);
		ad.add(213);
		ad.add(657);
		ad.add(678);
		ad.add(1253);
//		ad.addLast(null);   null pointteer exception
		
			ad.addLast(4353);
			
			System.out.println(ad.peekFirst());
			System.out.println(ad.peekLast());

			
		
	System.out.println(ad);
	System.out.println();
		
	}
}
