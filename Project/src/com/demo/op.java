package com.demo;
import com.assignment.*;
import com.timecomplaxity.*;
import java.util.*;
public class op {
	public static void main(String[] args) {
		Assignment1 a=new Assignment1();
		TimeCalculate t=new TimeCalculate();
		long st=t.startTime();
		
		int[] arr1= {2,45,6,43,333,67,5,3,3445};
		int[] arr2= {65,87,5,5,6};

		int[]common=a.common(arr1,arr2);
//		int ab[]=a.revers(arr1);
		System.out.print(Arrays.toString(common));
		
		long et=t.endTime();
		
		System.out.println(et-st);
	}
}
