package com.threads;

class ThreadPriority extends Thread{
    String name;

    public ThreadPriority(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("hello " + this.name);
    }



        public static void main(String[] args) {
            ThreadPriority t1 = new ThreadPriority("kiran");
            ThreadPriority t2 = new ThreadPriority("kiran2");
            ThreadPriority t3 = new ThreadPriority("kiran3");
            ThreadPriority t4 = new ThreadPriority("kiran4");
            ThreadPriority t5 = new ThreadPriority("kiran5");

            t5.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

        }
    }

