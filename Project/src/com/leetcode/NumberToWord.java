package com.leetcode;
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();

        int num=21111121;
        String text = numberToWord(num);
        System.out.println(text);
    }

    private static String numberToWord(int num){

        String[] str1 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        String[] str2 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String text="";
       
        
        while(num>0){
        	 if (num / 10000000 > 0) {
                 text += str1[num / 10000000] + " Crore ";
                 num %= 10000000;
             }
        	else if(num/100000 >0){
                 text+= str1[num/100000] +" Lakh ";
                 num%=100000;
             }

        	 else if(num/1000 >0){
                text+= str1[num/1000] +" Thousand ";
                num%=1000;
            }
            
            else if(num/100>0){
                text+= str1[num/100] +" Hundred and ";
                num%=100;
            }
            else if(num>0){
            	if(num<20) {
            		text+=str1[num]+"";
            	}    
            	else{
            		text+= str2[num/10]+" ";
            		if(num%10>0) 
            			text+=str1[num%10];
            		}
            	num%=1;
            }
       
        }

    return text;
    }

}
