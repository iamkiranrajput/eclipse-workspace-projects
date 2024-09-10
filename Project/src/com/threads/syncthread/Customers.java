package com.threads.syncthread;

public class Customers extends  Thread{
	
	static Ecommerce E;
	int order;
	
	public void run() {
		E.mobileOrders(order);
		System.out.println("Current Thread Name: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		E=new Ecommerce();
		Customers c1=new Customers();
		c1.order=15;
		c1.start();
		
		Customers c2=new Customers();
		c2.order=12;
		c2.start();
		
		Customers c3=new Customers();
		c3.order=10;
		c3.start();
		
		Customers c4=new Customers();
		c4.order=15;
		c4.start();
			
	}
}
