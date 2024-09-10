package com.strings;
import java.util.StringTokenizer;
//public class StringTokenizers {
//	public static void main(String[] args) {
//		StringTokenizer st=new StringTokenizer("India is my contry");
//		
//		while(st.hasMoreTokens()) 
//			System.out.println(st.nextToken());
//
//	}
//
//}
//
public class StringTokenizers{
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("India is my Country");
		
		int numberOfToken=st.countTokens();
		System.out.println(numberOfToken);
		
		System.out.println(st.getClass());
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
	
}