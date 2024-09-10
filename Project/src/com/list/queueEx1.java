package com.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queueEx1 {
	public static void main(String[] args) {
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(1);
		pq.add(2);
		pq.add(32432);
		pq.add(23);
		pq.add(23);
		pq.add(23);
		pq.add(23);
		
		
		
		
		
		System.out.println(pq);
//		pq.remove(1);
//		pq.poll();
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		
		pq.offer(101);   //set the size of the pq but its not fixed it will grow when the 11th data added
		
		
		System.out.println(pq.size());
		
		for(int i:pq) {
			System.out.print(i+" ");
		}
		
		Iterator it= pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
	
}
