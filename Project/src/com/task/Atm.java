package com.task;

import java.util.*;
public class Atm {

    static int balence=0;

//    Scanner s =new Scanner(System.in);



    static void deposite(){
        Scanner s =new Scanner(System.in);
        Random r=new Random();


        System.out.println("Enter Amount for deposit : ");
        int dep=s.nextInt();


        if(dep>0) {
            balence += dep;
            int a=r.nextInt(5000);
            try {
                System.out.println("Wait we are processing...");
                Thread.sleep(a);
            }catch(InterruptedException e){}
            System.out.println("your amount "+dep+" \u20B9 Deposited successfully");
        }
        else {
            System.out.println("deposit must be greater than 1");
            deposite();
        }
    }
    static void withdraw(){

        Random r=new Random();
        int a=r.nextInt(5000);

        Scanner s =new Scanner(System.in);

        System.out.println("Enter Amount for withdraw");
        int wit=s.nextInt();

        if(balence>wit) {

            try {
                System.out.println("Wait we are processing...");
                Thread.sleep(a);
            }catch(InterruptedException e){}
            balence -= wit;
            System.out.println("Withdrawal Successfully \n Take your money from ATM: ");
        }
        else
            System.out.println("Insufficient Balance ");
    }
    static void cBalence(){
        Random r=new Random();
        int a=r.nextInt(5000);

        Scanner s =new Scanner(System.in);
        try {
            System.out.println("Wait we are checking...");
            Thread.sleep(a);
        }catch(InterruptedException e){}
        System.out.println("your Balence are: "+balence+" \u20B9");
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("\n\n Welcome to APANA ATM");

        while(true) {
            System.out.println("Which operation you want to perform click the numbers: ");
            System.out.println("Deposit :1");
            System.out.println("Withdrawal :2");
            System.out.println("Check balance :3");
            int dec=s.nextInt();
//            char c=s.next().charAt(0);



            switch (dec) {
                case 1:
                    deposite();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    cBalence();
                    break;
                default:
                    System.out.println("Enter valid number: ");
                    break;
            }

            System.out.println("\n\n\nWould you like to perform other Operation (Y/N)");
            char d = s.next().charAt(0);
            if (d=='N' || d=='n') {
                System.out.println("Thanks for using 'APANA' ATM");
                break;
            }

        }




    }

}
