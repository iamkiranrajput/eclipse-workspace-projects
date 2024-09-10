package com.dsa;

public class Pattern3 {
	public static void main(String[] args) {
		int n=7;
		int stp=n/2;
		int spaces=1;
		int n1=n-stp;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=stp; j++) {
				System.out.print("*");
			}
			for(int k=0; k<=spaces; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=stp; j++) {
				System.out.print("*");
			}
		if(i<=n/2) {
			stp--;
			spaces=spaces+2;
		}
		else { 
			stp++;
			spaces=spaces-2;
		}
		System.out.println();

		}
	}
}
