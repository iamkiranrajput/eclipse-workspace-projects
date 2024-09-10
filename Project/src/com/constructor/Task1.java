package com.constructor;

public class Task1 {
	Task1(double a, int b, int c){
			System.out.println(a-(b+c));
	}
	Task1(int a, double b, int c){
		System.out.println(b-(a/c));
	}
	Task1(int a, int b, double c){
		System.out.println(c-(b*a));
	}
	public static void main(String[] args) {
		Task1 t1=new Task1(20,1,10.1);
		Task1 t2=new Task1(20.2,1,23);
		Task1 t3=new Task1(20,23.3,10);
	}
}
