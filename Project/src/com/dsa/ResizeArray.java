package com.dsa;

import java.util.Arrays;

public class ResizeArray {
	
	public static void main(String[] args) {
		int [] arr= resizeArray(new int[] {1,2,3,4,5,6});
		System.out.println(arr.length);
	}

	private static int[] resizeArray(int[] arr) {
		int temp[]=new int[arr.length*2];
		for(int i=0; i<arr.length; i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
}
