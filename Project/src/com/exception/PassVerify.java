package com.exception;
import java.util.Scanner;

import com.multicatch.UserDefinedException;

public class PassVerify {

	 void Passverify()throws UserDefinedException{
		 

			Scanner sc=new Scanner(System.in);
			String pass="2345";
//		 System.out.println("Please enter a password");
		if(pass=="1233") {
			System.out.println("Logged in");
			
		}else {
			System.out.println("try again");
		}
		}
	 public static void main(String[] args) {
		 PassVerify p=new PassVerify();
		 p.Passverify();
	}
	}

