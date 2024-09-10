package com.algoprep.dsa;

 abstract class Animals {
	private String name;
	
	public Animals(String name) {
	this.name=name;	
	}
	
	abstract void makeSound();
	
	public static void main(String[] args) {
//		Animals a=new Animals("Dog");
	}
	
	class Dog extends Animals{

		public Dog(String name) {
			super(name);
			System.out.println("Dog");
		}

		@Override
		void makeSound() {
			System.out.println();
			
		}
		
	}
	
	
}
