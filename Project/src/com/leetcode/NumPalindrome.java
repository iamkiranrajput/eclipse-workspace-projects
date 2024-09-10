package com.leetcode;

import java.util.Arrays;

public class NumPalindrome {
	public static void main(String[] args) {
		System.out.print(isPalindrome(-121));
		  
	}
	  public static boolean isPalindrome(int x) {
	        
	        String s= Integer.toString(x);
	        
	        for(int i=0, j=s.length()-1; i<j; j--,i++){
	        	if (s.charAt(i)!=s.charAt(j))
	            return false;
	        }
	       
	        return true;
	    }
	  
	  
}


