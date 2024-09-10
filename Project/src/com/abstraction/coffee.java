package com.abstraction;

class Coffee extends Machine {

@Override
void make(String a, String b, String c) {
	
	
	System.out.println(a+" + "+b+" + "+c);
	System.out.println("coffee made");
}

@Override
void make(String a, String b) {
	// TODO Auto-generated method stub
	
}
}
