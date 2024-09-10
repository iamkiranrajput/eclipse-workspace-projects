package com.threads;



class Threading2 extends Thread{
   public void run(){
       int i=0;
       while(i<4000) {
           System.out.println("im thread 2 chatting on phone");
           i++;
       }
   }
}
class Threading3 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("im singing a song ");
            i++;
        }
    }

}
public class Threading extends Thread{
   public void run(){
       int i=0;
       while(i<4000){
           System.out.println("Im thread 1 Eating food");
           i++;
       }
   }

   public static void main(String[] args) {
       Threading2 t1=new Threading2();
       Threading t2=new Threading();
       Threading3 t3=new Threading3();
       t3.start();
       t1.start();
       t2.start();
   }
}


