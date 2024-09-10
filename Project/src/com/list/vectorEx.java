
package com.list;

//import java.util.*;
import java.util.Vector;
import java.util.Iterator;


public class vectorEx {
	public static void main(String[] args) {
		Vector v= new Vector();
		
		v.add(10);
		v.add(20.20);
		v.add("abc");
		System.out.println(v);	
		
		
		
		Vector<Integer> v1=new Vector<>();
//		System.out.println(v1.capacity());
		v1.add(null);
		v1.add(20);
		v1.add(23);
		v1.add(40);
		
		System.out.println(v1);
		
		System.out.println("size of vector "+v1.size());
		System.out.println("capacity of vector "+v1.capacity()); // default capacity is 10 when 11th element inserted its double the capacity
		
		v1.add(20);
		v1.add(23);
		v1.add(40);		
		v1.add(20);
		v1.add(23);
		v1.add(40);		
		v1.add(20);
		v1.add(23);
		v1.add(40);
	
		
		
//		System.out.println("capacity of vector "+v1.capacity());
		
		
		System.out.println(v1);
//		v1.removeAll(v1);
		System.out.println(v1.contains(20));
		
		
		
		
		
		
		
		
	Iterator i= v1.iterator();
	
//		
//		System.out.println(i);
//		while(i.hasNext()) {
//			
//			System.out.println(i.next());
//		}
//		i.remove();
//		System.out.println(v1);
		
//		System.err.println(i.equals(i));
	}

	
	
	
	
//	int[] a= {1,2,3,4,5,6};
//	v1.addAll(a);		
}
