package com.task;

public class reve {
    public static void main(String[] args) {
        String originalString = "good morning I am from Chiplun";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}