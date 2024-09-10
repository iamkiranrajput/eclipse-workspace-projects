package com.map;

import java.util.HashMap;

public class HashmapEx2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<>();
		hm.put(1, "kiran");
		hm.put(3, null);
		hm.put(4, "jay");
		hm.put(5, null);
		hm.put(6, "raj");
		
		
		System.out.println(hm);
		hm.toString();
		hm.remove(1);
//		System.out.println(hm.toString());

		
		HashMap <String, String> a=new HashMap<>();
		a.put("name","kiran");
		a.put("roll", "104");
		
		
//		HashMap<Integer, String> h= new HashMap<>();
//		h.put(1, "gffhgf");
//		h.put(3, "vbffg");
		
		
//		System.out.println(h);
		
//        hm.merge(2, "fdgdgiran", (oldValue, newValue) -> "kir");
		
		
//		hm.forEach((key, value)->a.merge(key, value, String::concat));
		System.out.println(hm);
		System.out.println(hm.size());
		
	}
}
