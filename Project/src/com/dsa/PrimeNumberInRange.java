package com.dsa;

import java.util.ArrayList;
import java.util.HashSet;

public class PrimeNumberInRange {
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,13,15,18,19,34,35};
		
		int start=2;
		int end=7;
		
		HashSet<Integer> prime = new HashSet<>();
		
		for(int i=start; i<=end; i++) {
			
			if(isPrime(arr[i])) {
				
				prime.add(arr[i]);
			}	
			
			
			
		}
		for(Integer ww:prime) {
			System.out.println(ww);
			}
	}
	
	 public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }

	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
