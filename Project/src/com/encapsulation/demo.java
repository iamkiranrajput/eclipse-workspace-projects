package com.encapsulation;


class demo1{
	int age=50;
	
	 public demo1(){
		System.out.println("University");
	}
	
}

 class demo extends demo1 {
	
	 public demo() {
		 
		 
//		 super();  //its refers to the parent class constructor 
		 
		System.out.println(age+" college ");	
	}
	 
	 
	public static void main(String[] args) {
		
		demo d=new demo();
//		System.out.println(demo());

	}
}
