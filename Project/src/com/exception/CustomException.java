package com.exception;


	public class CustomException extends Exception {
		
	    public CustomException(String message) {
	        super(message);
	    }
	}

	 class Example2 {
	    public static void main(String[] args) {
	        try {
	            throw new CustomException("This is a custom exception");
	        } catch (CustomException e) {
	            System.err.println("Custom exception caught: " + e.getMessage());
	        }
	    }
	}

