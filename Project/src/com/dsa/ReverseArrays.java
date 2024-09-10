package com.dsa;

import java.util.Arrays;

public class ReverseArrays {
	
	public static int[] reverseArray(int[] arr) {
		int start =0, end = arr.length-1;
		
		if(arr.length<=0)
			return new int[]{-1};
		
		while( start<end) {
			
			reverse(arr,start,end);
			start++;
			end--;
		}

		return arr;
	}
	
	private static void reverse(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start]= arr[end];
		arr[end]=arr[start];
	}

	public static void main(String[] args) {
		int[] arr=reverseArray(new int[] {1});
		
		System.out.println(Arrays.toString(arr));
		
	}
}
