package com.abstraction;

public abstract class Machine {

	abstract void make(String a, String b, String c);
	abstract void make(String a, String b);


	
public static void main(String[] args) {
	Coffee c=new Coffee();
	c.make("Suger", "Milk", "Coffee Powder");
	
	BlackTea bt=new BlackTea();
	bt.make("Suger", "water", "Black tea Powder");
	
	Tea t=new Tea();
	t.make("Suger", "Milk", "Coffee Powder");
}
}









