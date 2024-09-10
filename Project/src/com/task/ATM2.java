package com.task;

import java.util.*;

interface function{
    void deposite();
    void withdraw();
    void cBalence();
}

public class ATM2 implements function{
    static int balence=0;
    Scanner s =new Scanner(System.in);
    Random r=new Random();

    @Override
    public void deposite(){

        System.out.println("Enter Amount for deposit : ");
        int dep=s.nextInt();


        if(dep>0) {
            balence += dep;
            int a=r.nextInt(5000);
            try {
                System.out.println("Wait we are processing...");
                Thread.sleep(a);
            }catch(InterruptedException e){

                System.out.println("error"+e.getMessage());

            }
            System.out.println("your amount "+dep+" \u20B9 Deposited successfully");
        }
        else {
            System.out.println("deposit must be greater than 1");
            deposite();
        }
    }

	@Override
    public void withdraw(){
        int a=r.nextInt(5000);


        System.out.println("Enter Amount for withdraw");
        int wit=s.nextInt();

        if(balence>wit) {

            try {
                System.out.println("Wait we are processing...");
                Thread.sleep(a);
            }catch(InterruptedException e){

                System.out.println("error"+e.getMessage());

            }
            balence -= wit;
            System.out.println("Withdrawal Successfully \n Take your money from ATM: ");

        }
        else
            System.out.println("Insufficient Balance ");
    }
    @Override
    public void cBalence(){
        int a=r.nextInt(5000);

        try {
            System.out.println("Wait we are checking...");
            Thread.sleep(a);
        }catch(InterruptedException e){
            System.out.println("error"+e.getMessage());
        }
        System.out.println("your Balence are: "+balence+" \u20B9");
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        ATM2 atm=new ATM2();
        System.out.println("\n\n Welcome to APANA ATM");

        while(true) {
            System.out.println("Which operation you want to perform Enter the numbers: ");
            System.out.println("Deposit :1");
            System.out.println("Withdrawal :2");
            System.out.println("Check balance :3");
            int dec=s.nextInt();
//            char c=s.next().charAt(0);
            
            switch (dec) {
                case 1 -> atm.deposite();
                case 2 -> atm.withdraw();  
                case 3 -> atm.cBalence();
                default -> System.out.println("Enter valid number: ");
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


