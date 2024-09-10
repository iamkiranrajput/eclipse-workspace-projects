package com.constructor;

public class Addition {
	Addition(){
		
		System.out.println("Default constructor");
	}
	Addition(int a){
		System.out.println(a);
	}
	Addition(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Addition ad=new Addition();
		Addition ad1=new Addition(10);
		Addition ad2=new Addition(20,50);

	}

}
