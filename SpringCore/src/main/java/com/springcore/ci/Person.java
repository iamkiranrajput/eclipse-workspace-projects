package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	List<String> list;
	
	
	public Person(String name,int personId, Certi certi,List<String> list) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;	
		this.list=list;
	}
	public String toString() {
		return this.name+" : "+this.personId+" { "+this.certi.name+" } "+"list{ "+this.list+" }";
		
	}
	
	
}
