package com.springcore.auto.wire;

public class Employee {
	private Address add;

	public Address getAddress() {
		return add;
	}

	public void setAddress2(Address address2) {
		System.out.println("setting value");
		this.add = address2;
	}
	
	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.add = address;
		System.out.println("Inside consrtructoe");
	}

	@Override
	public String toString() {
		return "Employee [address=" + add + "]";
	}
	
	
	
}
