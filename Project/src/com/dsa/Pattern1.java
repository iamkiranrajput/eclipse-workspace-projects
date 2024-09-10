package com.dsa;

public class Pattern1 {
	public static void main(String[] args) {
		int row=5,spaces=1;
		spaces=row-1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			spaces--;
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
		}
	}

}
