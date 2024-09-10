package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public Pepsi() {
		super();
	}
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public void afterPropertiesSet() throws Exception {
//			it act as init
		
		System.out.println("Taking pepsi : init");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("going to put the bolltle in dusbin");
		
	}
	
}
