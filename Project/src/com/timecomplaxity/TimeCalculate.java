package com.timecomplaxity;

public class TimeCalculate {
	
	public long startTime() {
		long startTime=System.nanoTime();
		
		return startTime; 
	}
	public long endTime() {
		long endTime=System.nanoTime();
		
		return endTime; 
	}

//	public static void main(String[] args) {
//		
//		
//		
//		long startTime= startTime();
//		StringBuffer sb=new StringBuffer("java");
//		StringBuffer sb2=  new StringBuffer();
//		for(int i=0; i<10000; i++)
//			
//			{
//			sb2.append(sb);
//		}
//		long endTime=endTime();		
//		
//		System.out.println(endTime-startTime);
//
//		
//		long startTime1=startTime();
//		StringBuilder sl=new StringBuilder("java");
//		StringBuilder sl1=  new StringBuilder();
//		for(int i=0; i<10000; i++)
//			
//			{
//			sl1.append(sl);
//		}
//		long endTime1=endTime();
//		
//		System.out.println(endTime1-startTime1);
//	}
}
