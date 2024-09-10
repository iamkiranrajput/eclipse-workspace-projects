package com.codecon;


	public class Student {
	  int reg_no;
	  String name;
	  double percentage;
	  
	public Student(int reg_no2, String name2, double percentage2) {

		this.reg_no=reg_no2;
		this.name=name2;
		this.percentage=percentage2;
	}

	public int getReg_no() {
		return reg_no;
	}
	
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	@Override
	public String toString() {
		return "Student [reg_no=" + reg_no + ", name=" + name + ", percentage=" + percentage + ", getReg_no()="
				+ getReg_no() + ", getName()=" + getName() + ", getPercentage()=" + getPercentage() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	}
