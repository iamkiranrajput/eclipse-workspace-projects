package com.list;

import java.util.*;
import java.io.*;

public class ListEx {
	public static void main(String[] args) {
		List obj =new ArrayList<>();
		obj.add(2);
		obj.add(44);
		obj.add(33);
		
		System.out.println(obj.get(1));
//		System.out.println(obj);
		obj.add(3,3);
		System.out.println(obj);
		
	}

}

