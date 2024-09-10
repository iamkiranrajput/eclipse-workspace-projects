package com.spring.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("pes college")
	private String collegeName;
	
	@Autowired  //to store the ref object of the student class
	private Student s1;
	
	
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", s1=" + s1 + "]";
	}
	
	
}

