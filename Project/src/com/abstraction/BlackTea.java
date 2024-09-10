package com.abstraction;

class BlackTea extends Machine {

@Override
void make(String a, String b, String c) {
	System.out.println(a+" + "+b+" + "+c);
	System.out.println("Black Tea made");
}

@Override
void make(String a, String b) {
	// TODO Auto-generated method stub
	
}
}