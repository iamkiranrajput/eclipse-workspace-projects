package com.dsa;

public class PrimeNumber {
	public static void main(String[] args) {
//		int count=0,no=11;
//		for(int i=1; i<=no; i++) {
//			if(no%i==0) {
//				count++;
//			}
//			
//			
//		}
//		System.out.print(count);
//		if(count>2)
//			System.out.println("not prime");
//		else
//			System.out.println("prime");
//
//	}
		
		int count=0, no=11;
		for(int i=1; i<no; i++) {
			if(no%i==0) {
				count++;
			}
		}
		
			System.out.println((count>2)?"not prime":"prime");
		
	}
}
