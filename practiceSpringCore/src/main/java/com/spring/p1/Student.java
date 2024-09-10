package com.spring.p1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("kiran")
	private String name;
	@Value("123")
	private int id;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	
	
	
}


