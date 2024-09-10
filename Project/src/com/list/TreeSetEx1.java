package com.list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
//		Elements in a TreeSet are stored in sorted, ascending order.
//TreeSet does not allow null elements. If you try to add null, it will throw a NullPointerException.
		//self-balancing nature   (balanced tree)
		//Duplicate not alloweed
		
		
	HashSet<String> h1=new HashSet<>();
//		h1.add(null);
		h1.add("name");
		h1.add("aa");
		
		TreeSet<String> s=new TreeSet<>(); 
		
		s.add("hello");
		s.add("neno");
		
		Set<String> s1=new TreeSet<>(); 
		
		s1.add("abc");
		s1.add("karn");
		s1.add("mumbai");
		s1.add("pune");
		
//		it store the data in alphabetical order in ascending order
//		s1.add(null);    null not allowed null pointer exception 
		
		s1.addAll(h1);
		s1.addAll(s);   
		System.out.println(s1);
		
		
		LinkedList<Integer> l1=new LinkedList<>();
		
		Set<Object> a=new TreeSet<>();
		
		a.add("asasnjgkbgd");
		
//		a.add(h1);
//		a.add(l1);
		
//		a.add(s);
		System.out.println(a);
		
		
		
		
	}
}
