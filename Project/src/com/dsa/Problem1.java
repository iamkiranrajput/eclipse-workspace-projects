package com.dsa;

public class Problem1 {
    static void printNumbers(int n) {
        if (n > 0) {
            System.out.println(n);

            printNumbers(n - 1);
//            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int N = 10; // Change N to the desired value
        printNumbers(N);
    }
}
