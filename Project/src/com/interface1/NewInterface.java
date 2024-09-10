package com.interface1;

public interface NewInterface {

    int a=10;
    static void  print(){
        System.out.println("hello");
    }

    default void  print1(){
        System.out.println("hello1");
    }
}
class Main1 implements NewInterface {
    public static void main(String[] args) {
        Main1 m=new Main1();
        m.print1();
        
    }
}