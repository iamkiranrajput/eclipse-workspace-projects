package com.symbiosys;

public class StaticExample {
	 static int i=0;
	 int b=0;

	
	public static void  display() {
		StaticExample sd1=new StaticExample();

		sd1.b++;
		i++;
	}
	public void show() {
		b++;
		i++;
	}
	public static void main(String[] args) {
		
		
		
		
		

		StaticExample sd=new StaticExample();
		sd.display();
		sd.display();
		sd.show();
		sd.show();
		
		System.out.println(i);
		System.out.println(sd.b);

	}
}
