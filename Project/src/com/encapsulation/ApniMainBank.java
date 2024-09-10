package com.encapsulation;

public class ApniMainBank {
	
	public static void main(String[] args) {
		ApniBank b=new ApniBank(1234512345, "raj", 280000, 888876);
		ApniBank b1=new ApniBank(43532, "kiran", 28000, 888876);
		ApniBank b2=new ApniBank(345333454, "rushikesh", 280030, 888876);

		System.out.println(b.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());

	}
}
