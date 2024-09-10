package com.dsa;

public class Factor3 {

	
	
	public static void main(String[] args) {
		int count =0;
		int n = 11;
		for(int i=1; i*i<=n; i++) {
			
			if(n%i==0) {


				  if (i * i == n) {
	                    count += 1; // Perfect square
	                } else {
	                    count += 2; // Pair of factors
	                }
			}	
		}
		
		System.out.println(count);
	}
}
