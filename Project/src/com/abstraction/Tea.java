package com.abstraction;

class Tea extends Machine {

@Override
void make(String a, String b, String c) {
	if(a=="")
	System.out.println(a+" + "+b+" + "+c);
	System.out.println("Tea made");
}

@Override
void make(String a, String b) {
	// TODO Auto-generated method stub
	
}
}
