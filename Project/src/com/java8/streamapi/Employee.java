package com.java8.streamapi;

public class Employee {
	String eName;
	Integer eId;
	Double eSalary;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Double geteSalary() {
		return eSalary;
	}
	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(Integer eId,String eName,  Double eSalary) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + "]";
	}
	
}
