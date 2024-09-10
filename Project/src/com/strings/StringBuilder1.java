
package com.strings;

public class StringBuilder1 {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		StringBuilder s1=new StringBuilder(20);
		StringBuilder s2= new StringBuilder("rajput");
		System.out.println(s1.capacity());
		System.out.println(s2.append("kirran"));
		System.out.println(s2.capacity());
		
		s2.append(456);
		System.out.println(s2);
	}

}
