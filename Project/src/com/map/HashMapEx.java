package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map hm= new HashMap<>();
		hm.put(1, "kiran");
		hm.put(3, null);
		hm.put(4, "jay");
		hm.put(5, null);
		hm.put(6, "raj");
		System.out.println(hm.size());
		
		System.out.println(hm);
		hm.toString();
		hm.remove(1);
//		System.out.println(hm.toString());

		
		HashMap <String, String> a=new HashMap<>();
		a.put("name","kiran");
		a.put("roll", "104");
		
		
		HashMap<Integer, String> h= new HashMap<>();
		h.put(1, "gffhgf");
		h.put(3, "vbffg");
		
		
		hm.putAll(h);					//its updating the exesting value of the key and we ocan be add another hash map value
		System.out.println(hm);
		
		hm.put(1, "raj");		//its updating the existing value of the key 
		System.out.println(hm);
		
		System.out.println(	h.get(1));    // return the value of the key which is inserted in thhe key
		
		
//		System.out.println(	hm.getClass());    //retun the  class of the object
		
		
		
		
		
//		2d hashmap 
		
//		HashMap<Integer, HashMap<Integer, String> b= new HashMap<>();     // we  can be creathe the 2d hash like this

		HashMap<Integer, HashMap> b= new HashMap<>();
		
		b.put(123,h);
		b.put(2131,h);
		b.put(213,h);
//		System.out.println(b);
		
		HashMap<Integer, HashMap> c= new HashMap<>();
		
		c.put(111, b);
		
		System.out.println(c + "\n");
//		System.out.println(c.get(111));
		
		
		
		HashMap j=c.get(111);
		HashMap k=(HashMap) j.get(2131);
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(k.get(1));
		
//		System.err.println(c.get(111));
//		System.out.println(c.get(111).get(2131)); // we can access the value of the 3d hashmap
//		System.out.println(c.get(1));
//		System.out.println(c.get(111));


		
	}
}
