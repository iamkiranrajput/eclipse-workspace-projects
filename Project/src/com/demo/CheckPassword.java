package com.demo;

public class CheckPassword {

    static int checkPassword(String str, int n){

        if(n<4)
            return 0;
        else if(!str.matches(".*\\d.*."))
            return 0;
        else if(!str.matches(".*[A-Z].*"))
            return 0;
        else if(str.contains(" ")|| str.contains("/"))
            return 0;
        else if (Character.isDigit(str.charAt(0)))
            return 0;

        return 1;
    }

    public static void main(String[] args) {
        String str="Kir an@1234";
        int n=str.length();
        System.out.println(checkPassword(str, n));
    }
}
