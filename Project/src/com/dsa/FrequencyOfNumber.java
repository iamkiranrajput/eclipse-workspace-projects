package com.dsa;

import java.util.HashMap;
import java.util.Iterator;

public class FrequencyOfNumber {
		
	public static HashMap<Integer, Integer> frequency(int[] arr){
		
		
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int m: arr) {
			if(map.containsKey(m)) {
				
				map.put(m, map.get(m)+1);
			}
			else {
				map.put(m, 1);
			}
		}
		return map;
		
		 
		
	}
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,1,2,1,2,9,7,4,5,6,6};
		
		HashMap<Integer,Integer>map=frequency(arr);
//		System.out.println(map.get(6));
		map.forEach((key, value) -> {
		    System.out.println("Key: " + key + ", Value: " + value);
		});
	}
}
