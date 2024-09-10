package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfSubArray_SW {

	
	    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
	        // code here
	        long maxSum=0;
	        
	        
	        for(int i=0; i<=N-K; i++){
	            
	            int sum = 0;

	            for(int j=i; j<=i+K-1; j++){
	                
	                sum+=Arr.get(j);
	            }
	            maxSum=Math.max(maxSum,sum);
	        
	        }
	        
	        return maxSum;
	        
	        
	    }
	    
	    public static void main(String[] args) {
	    	ArrayList<Integer> n1= new ArrayList();
	    	
	    	n1.add(81);
	    	n1.add(12);
	    	n1.add(5);
	    	n1.add(2);
	    	n1.add(12);
	    	n1.add(1);
	    	n1.add(2);
	    	n1.add(5);
	    	
	    	long sum=maximumSumSubarray(3,n1, n1.size());
	    	
	    	System.out.println(sum);
	    	
		}
	}
