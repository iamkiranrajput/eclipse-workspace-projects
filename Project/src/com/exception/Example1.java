package com.exception;

public class Example1{
    public static void main(String[] args) {
        try {
            validateInput(5);
            validateInput(-3); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }

    private static void validateInput(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        // Additional validation logic
    }
}

