package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
	
	   //here you aarre creating the object and it retruning to the studrent 
			//the bean annotation take this object and store in the ioc container 
			//further if sommeone waant the object then he'll pass the object to him
//	@Bean(name = {"student", "con", "obj"})
	@Bean
	public Student getStudent() {
		Student student =new Student("kiran",getSamosa());
		return student;
	}
	
}
