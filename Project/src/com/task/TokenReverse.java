package com.task;

import java.util.StringTokenizer;

import java.util.StringTokenizer;

public class TokenReverse {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("good morning i am from chiplun");
        StringBuilder rs = new StringBuilder();

        
        while (st.hasMoreTokens()) {
        	
            rs.insert(0, st.nextToken());
            
            if (st.hasMoreTokens()) {
                rs.insert(0, " ");
            }
        }

        System.out.println( rs.toString());
    }
}
