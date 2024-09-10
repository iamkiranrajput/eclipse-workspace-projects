package com.abstractionproject;

public class Made extends Machine{
	String milk="milk";
	String suger="suger";
	String tea="tea powder";
	String cofee="cofee powder";
	
	void make(String a, String b) {
		
		if(a.equals(milk) && b.equals(cofee)) 
			System.out.println("made cofee");
		
		else if(a=="" && b.equals(tea)) 
			System.out.println("made Black tea");
		
		else if(a=="" && b.equals(cofee)) 
			System.out.println("made Black cofee");
		
		else if(a.equals(milk) && b.equals(tea))
			System.out.println("Made Tea");
		else
			System.out.println("Invalid Combination");
		
	}
}
