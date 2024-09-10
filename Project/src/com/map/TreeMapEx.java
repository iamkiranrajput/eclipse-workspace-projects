package com.map;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> a=new TreeMap<>();
//		TreeMap<Integer, String> a=new TreeMap<Integer, String>();
		
		a.put(123, "dfijdoig");
		a.put(45, "jay");
		a.put(234, "veer");
		a.put(123, "on");			//replacing the value of 123
		a.put(567, "pff");
		a.put(177, "pff");
		a.put(190, "pff");

		System.out.println(a);
		System.out.println(a.get(1212));
		System.out.println(a.higherKey(123));		//its return the higher key  or next greater  key
		
		System.out.println(a.firstKey());
		System.out.println(a.ceilingKey(165));     //ceilingKey return the ceiling key just like if ex. (50.9)-> 51 or (50.3)->51
		System.out.println(a.floorKey(47));			//floor return the floor key  ex. (40.9)-> 40 or (40.3)-> 40
		
		System.out.println(" if not avilable it returnt the (value-> NAN )"+a.getOrDefault(34563543, "NAN"));  //if key not present its retunrn the NAN default
	
		System.out.println(a.tailMap(177));			//return the key and value from (177) onward
			
	}
}
