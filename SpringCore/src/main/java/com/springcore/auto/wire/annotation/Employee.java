package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}
	
	public Employee() {
		super();
	}

	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside consrtructoe");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
}
