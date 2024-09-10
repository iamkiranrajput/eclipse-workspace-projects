  package com.abstraction;

public abstract class ATM {
	 void withdraw() {
		System.out.println("withdraw");
	}
	 abstract void deposite();
//	 {System.out.println("deposite");}

}
class Main extends ATM{
	
	
	
	public static void main(String[] args) {
		Main m=new Main();
		m.deposite();
	}
	void deposite() {
			System.out.println("Hello, i'm overrided abstract method");
	}
	
}
