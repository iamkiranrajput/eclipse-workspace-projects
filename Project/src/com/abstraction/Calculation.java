package com.abstraction;

public abstract class Calculation {

	  abstract void calculate(int a, int b);
	
		
	
	public static void main(String[] args) {
		Addition add=new Addition();
		Sub sub=new Sub();
		Div div= new Div();
		
		Multiplication mul= new Multiplication();
		div.calculate(22, 22);
		sub.calculate(2, 2);
		add.calculate(22, 23);
		mul.calculate(2, 2);
		
		
	}
}