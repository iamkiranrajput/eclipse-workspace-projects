package com.springcore.ref;

public class A {
	private int x;
	private B ob;
	
	
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}
	public void setXab(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}


	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
}
