package com.assignment;
import java.util.HashSet;
import com.timecomplaxity.*;
public class CommonNumbersInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,7};
        int[] arr2 = {3, 4, 5, 6, 7, 7,7};
        TimeCalculate t=new TimeCalculate();
        
        long a=t.startTime();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
       
        System.out.print("Common numbers in the arrays: ");
        for (int num : arr2) {	
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
        long b=t.endTime();
        
        System.out.print(b-a);
        
    }
}
