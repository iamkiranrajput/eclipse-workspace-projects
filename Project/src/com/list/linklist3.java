package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linklist3 {

	public static void main(String[] args) {
		List<String> list =new LinkedList<>();
		
		list.add("10");
		list.add("3454");
		list.add("435435");
		list.add("435435");
		list.add("32432");
		list.add("32432");
		list.add("232");
		
		ListIterator<String>litr=list.listIterator();
		
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
		
		System.out.println(litr.next());
		System.out.println(litr.next());
	

		System.out.println(litr.previous());
		
		
		
		ArrayList<String> ab=new ArrayList<>();
		ab.add("ref");
		ab.add("ref");
		ab.add("ref");

		
//		ListIterator<String> b=new ab.listIterator();

	}
}
