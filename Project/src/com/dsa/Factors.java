package com.dsa;

public class Factors {
	public static void main(String[] args) {
		int count=0;
		int factorOf=11;
		
		for(int i=1; i*i<=factorOf; i++) {
			
			if(factorOf%i==0) {


				  if (i * i == factorOf) {
	                    count += 1; // Perfect square
	                } else {
	                    count += 2; // Pair of factors
	                }
			}	
			
		}
		System.out.println("Total Factors: "+count);
		
	}
}
