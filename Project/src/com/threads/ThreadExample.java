package com.threads;

public class ThreadExample implements Runnable {
//	private static final int 2 = 0;
	int i=0;
	@Override
	public void run() {
		
	while(i<30) {
		System.out.println(" iam Thread "+i);
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
		i++;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
	
	public static void main(String[] args) {
		

		ThreadExample a= new ThreadExample();
		
		Thread t1=new Thread(a);
		t1.start();


//		System.out.println(Thread.currentThread().getPriority());

		int i=0;
		while(i<20) {
			System.out.println("Im main thread");
			
			i++;
			try {
				t1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}



	

}
