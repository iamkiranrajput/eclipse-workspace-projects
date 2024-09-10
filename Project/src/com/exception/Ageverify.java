package com.exception;
import java.util.*;
public class Ageverify {
	Scanner s=new Scanner(System.in);
	
	void age() throws AgeException{
		System.out.println("enter age");
		int ab=s.nextInt()
;		
		if(ab<18) {
//		System.out.println("yyou are eligible for vote");
			throw new AgeException("error");
		}
		else {
			System.out.println("logdin");
		}
	}
	public static void main(String[] args){
		try {
		Ageverify a=new Ageverify();
		a.age();
		}catch(AgeException e) {
//			System.out.println(e.());
		}
		
	}
}
