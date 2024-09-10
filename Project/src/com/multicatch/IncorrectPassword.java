package com.multicatch;

public class IncorrectPassword extends RuntimeException{
	IncorrectPassword(String msg){
		super(msg);
	}

}	
