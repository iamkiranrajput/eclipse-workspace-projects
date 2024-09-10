package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Student {
	private String name;
	
	private Samosa samosa;
	
	
	public void study() {
		samosa.display();
		System.out.println("Student is studing");
	}


	public Student(String name, Samosa samosa) {
		super();
		this.name = name;
		this.samosa = samosa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
}
