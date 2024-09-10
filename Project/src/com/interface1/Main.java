package com.interface1;

class Main implements Test{

	@Override
	public void show() {
		System.out.println("kiran");	
	}
	public static void main(String[] args) {
		Main m= new Main();
		m.show();
	}
}

//interface is a blueprint of the class
//interface immplements class
//class extends class
// interface extends interface