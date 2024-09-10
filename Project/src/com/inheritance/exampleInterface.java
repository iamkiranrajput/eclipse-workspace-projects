package com.inheritance;

public interface exampleInterface {
	
	int a= 20; // final ,stastic  public 
	 
	void details();
	
//	default void detail() {
//		
//	}
	static void eerr() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
	}
		
}
