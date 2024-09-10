package com.multicatch;

import java.util.*;
public class passwordVerify {
	void pass(String p) {
		
		if(p=="pass123") {
			System.out.println("you logged in");
		}
		else {
			throw new IncorrectPassword("Incorect password");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		passwordVerify p=new passwordVerify();
		
		System.out.println("Enter your password");
		String password=s.nextLine();
		
		try {
		p.pass(password);
		}catch(ArithmeticException e) {
			System.out.print(e.getMessage());
		}
	}
	
	
}
