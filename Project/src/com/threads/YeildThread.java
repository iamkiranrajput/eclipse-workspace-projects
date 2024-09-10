package com.threads;

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
        	
            System.out.println("first thread running..."+i);
            Thread.yield(); // Yield the thread
        }
 for (int i = 0; i < 100; i++) {
        	
            System.out.println("Thread is running..."+i);
//            Thread.yield(); // Yield the thread
        }
    }
}

 public class YeildThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable1());
        thread.start();
    }
}
