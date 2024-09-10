package com.list;

import java.util.HashSet;
import java.util.Set;

public class setEx {
	public static void main(String[] args) {
		HashSet<Integer> s= new HashSet();
		
//		HashSet: Does not guarantee any specific order of elements. The order can change over time as elements are added or removed. The ordering is based on the hash codes of the elements.
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(1);
		s.add(2);
		s.add(3);
		
		HashSet<Integer> s1= new HashSet();

		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(1);
		s1.add(2);
		s1.add(3);
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(s.add(233232));
		System.out.println(s.remove(1));
		System.out.println(s.hashCode());
		
		System.out.println(s);
		System.out.println(s.hashCode());
		
		
		
		
		s.removeAll(s1);
		s.clear();
		System.out.println(s);


	}

}
