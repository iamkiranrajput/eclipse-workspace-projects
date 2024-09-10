package com.threads.syncthread;

public class Ecommerce {
	int mobileStock =50;
	void  mobileOrders(int order) {
		if(mobileStock>order)
		{
			System.out.println("Mobile ordered successfully");
			mobileStock=mobileStock-order;
			System.out.println("Mobile  Left:"+mobileStock);
		}
		else {
			System.out.println("out of stock");
		}
	}
	public static void main(String[] args) {
		
	}
}
