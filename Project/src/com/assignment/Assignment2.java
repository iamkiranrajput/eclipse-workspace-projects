package com.assignment;
import java.util.*;

public class Assignment2 {
	
//	find missing no from 2 array

//	reverse array
	static void revers(int[] arr) {
		for(int i=0, j=arr.length-1; i<j; i++,j--) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
//			arr[i]=arr[i]^arr[j];
//			arr[j]=arr[i]^arr[j];
//			arr[i]=arr[i]^arr[j];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
//	write a program and find common no in  2 array
	static void common(int[] arr1, int[] arr2) {

		int common;
		System.out.print("common numbers are: ");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) {
					common=arr1[i];
					System.out.print(+common+" ");
				}
			}	
		}	
	}
	
	// remove duplicate from array
	static void duplicate(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) 
					System.out.println(arr[i]);
			}
		}
		
		
	}
	
//	addition of two matrix of same sizes first row with seconds matrix of 3 column
	static void  matrixAdd(int[][] matrix1, int[][] matrix2) {
		int[][] matrix= {{0,0},{0,0}};
		
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				
				matrix[i][j]=matrix1[i][j]+matrix2[i][j];
				
//				System.out.print(matrix1[i][j]+" "+matrix2[i][j]);
			}
//		
			System.out.println();
			
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][]a= {{1,2},{3,4}};
		int[][]b= {{4,3},{2,1}};
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int[] arr1= {2,45,6,43,3,67,5,3,2};
		revers(arr);
		common(arr1,arr);
		duplicate(arr1);
		matrixAdd(a,b);
	}	
}