package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vadapav {
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Vadapav() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vadapav [price=" + price + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("method start");
		
	}
	@PreDestroy
	public void End() {
		System.out.println("method End");
	}
}
