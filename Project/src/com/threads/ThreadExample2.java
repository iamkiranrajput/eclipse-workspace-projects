package com.threads;

//Step 1: Implement the Runnable interface
class MyRunnable implements Runnable {
 @Override
 public void run() {
     // Code to be executed in the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread " + Thread.currentThread().getId() + " - Count: " + i);
//         try {
//             // Introducing a delay to simulate some work in the thread
////             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
     }
 }
}

public class ThreadExample2 {
 public static void main(String[] args) {
     // Step 2: Create an instance of the class implementing Runnable
     MyRunnable myRunnable = new MyRunnable();

     // Step 3: Create a Thread and pass the Runnable instance to its constructor
     Thread thread1 = new Thread(myRunnable);

     // Step 4: Start the thread
     thread1.start();

     // You can create and start more threads if needed
     Thread thread2 = new Thread(myRunnable);
     thread2.start();

     // Main thread continues to do its work
     for (int i = 1; i <= 3; i++) {
         System.out.println("Main Thread - Count: " + i);
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
     }
 }
}
