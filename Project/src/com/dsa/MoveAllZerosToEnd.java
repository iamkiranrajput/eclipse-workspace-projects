package com.dsa;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	public static int[] movingZerosToEnd(int[] arr) {
		int j=0;
//		{1,7,4,0,0,6,0}
		for(int i=0; i<arr.length-1; i++) {
	
			if(arr[i]!=0 && arr[j]==0) {
				reverse(arr,i,j);
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		
		
		
		return arr;
	}
	
	
//	public static void find() {
//		int[] arr= {1,0,4,5,6,2,0,3};
//		
//		int j=0;
//		for(int i= 0; i<arr.length; i++) {
//			
//			if(arr[i]!=0 && arr[j]==0) 
//				reverse(arr, i, j);
//			
//			if(arr[j]!=0)
//				j++;
//		}
//		
//		System.out.println("string is"+ Arrays.toString(arr));
//		
//	}
	
	
	public static void reverse(int[] arr, int start, int end) {
		
		int temp = start;
			arr[start]=arr[end];
			arr[end]=temp;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(movingZerosToEnd(new int[] {1,2,3,0,4,3,0,9,0})));

	
	}
}
