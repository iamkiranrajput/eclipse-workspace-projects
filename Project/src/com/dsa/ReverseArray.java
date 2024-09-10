package com.dsa;

import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		reverseArray(arr,0,arr.length-1);
//		for(int i=0, j=arr.length-1; i<=j; i++, j--) {
//
//			
//			int temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
////			swap(arr[i],arr[j]);
//
//		}
		
//		int i=0, j=arr.length-1;
//		while(i<=j) {
//			
//			
//			
//			int temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
////			swap(arr[i],arr[j]);
//			i++;
//			j--;
//		}
		System.out.println(Arrays.toString(arr));
		
		

	}

//	 static void swap(int i, int j) {
//		int temp=i;
//		i=j;
//		j=temp;
		// TODO Auto-generated method stub
	
	
	
	
	  //Function to reverse array using recursion
	   static void reverseArray(int arr[], int start, int end) {
	      if (start < end) {
	         int tmp = arr[start];
	         arr[start] = arr[end];
	         arr[end] = tmp;
	         reverseArray(arr, start + 1, end - 1);
	      }
	   }
	}






