package com.inheritance;

public class MultipleInheritance implements Interface1,Interface2 {

	
	
	public static void main(String[] args) {
		MultipleInheritance m=new MultipleInheritance();
		m.print();
	}

	@Override
	public void print() {
		System.out.println("hello");
		
	}

	
}




