package com.abstractionproject;

public abstract class Machine {

	
	abstract void make(String a, String b);
	
	
	public static void main(String[] args) {
		Made m= new Made();
		m.make("milk","tea powder");
		m.make("","cofee powder");
		m.make("","tea powder");

	}
}
