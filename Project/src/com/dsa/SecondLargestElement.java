package com.dsa;

public class SecondLargestElement {
	
	
	public static int secondLargestElement(int[] arr, int length) {
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		if(length<1)
			return length;
		
		for(int i=0; i<length; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest= arr[i];
				
				
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		
		return secondLargest;
	}

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,45,5,67,45,6,4,55};
		int secondLargest =secondLargestElement(arr,arr.length);
		System.out.println(secondLargest);
	
	}
}
