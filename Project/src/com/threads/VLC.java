package com.threads;

public class VLC extends Thread {
	
	public void run() {
		int i=1;
		while(i<30) {
		
		Thread.currentThread().setName("first thread");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(MAX_PRIORITY);

//		System.out.println(Thread.currentThread().getPriority());
			i++;
		}
	}
	
	public static void main(String[] args) {	
	
		VLC Audio = new VLC();
		Thread t=new Thread(Audio);
//		Thread t1 = new Thread(Video);
		t.start();
//		t1.start();
		int i=1;
		while(i<30) {
			Thread.currentThread().setName(" Main thread");
			System.out.println(Thread.currentThread().getName());
//			Thread.currentThread().setPriority(NORM_PRIORITY);
//			Thread.currentThread().setPriority(MIN_PRIORITY);
//			Thread.currentThread().setPriority(MAX_PRIORITY);

//			System.out.println(Thread.currentThread().getPriority());
			i++;
//			try {
//			int a=10/0;
//			}catch(ArithmeticException e) {
//				System.out.println("divide by zero");
//			}
		}
		
	
	}

}
