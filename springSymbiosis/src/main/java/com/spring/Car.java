package com.spring;

public class Car {
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	 
		public void getEngineStatus() {
		engine.startEngine();
		engine.stopEngine();
	
	}
}	

