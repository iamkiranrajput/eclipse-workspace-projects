package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa{
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting the price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method");
	}
	
	
}