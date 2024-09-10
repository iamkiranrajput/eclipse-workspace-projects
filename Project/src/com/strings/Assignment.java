package com.strings;
import java.util.*;
public class Assignment {
//count vowals and consonent present in String
//Reverse String
//Remove duplicate charecter from string
//count duplicate & print charecter count
//	count capital letters present in string
	
	
	
	static char[] vowals(String s) {
		char[] reverse=new char[s.length()];
		int count=0;
		for(int i=s.length()-1,j=0; i>=0; j++,i--) {
			
			count=vowalCount(reverse,j);
			reverse[j]=s.charAt(i);
		}
		char[] rs= reverse;
			
			rs[rs.length-1]=(char)count;
			
		//String rs=String.valueOf(reverse);
		
		return rs;
		
	}
	static int vowalCount(char[] arr, int j) {
		int vowalCount=0;
		
		if(arr[j]=='a' ||arr[j]=='e' ||arr[j]=='i' ||arr[j]=='o' ||arr[j]=='u') {
			vowalCount++;
		}
		return vowalCount;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(vowals("abcde")));
	}
}



