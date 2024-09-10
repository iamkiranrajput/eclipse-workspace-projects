package com.threads;

// class Threading1 extends Thread{
//   public void run(){
//	  for(int i=0; i<=20; i++) {
//		  if(i%2!=0) 
//	           System.out.println("Thread 2 _____"+i); 
//	        
//	    	  
//	  }
//   }
//
// }
// 
// class Threading11 extends Thread{
//	 public void run(){
//	 for(int i=0; i<=20; i++) {
//		  if(i%2!=0) 
//	          System.out.println("Thread 1______"+i); 
//	 }
//	    	   
//	 }
//	}
// 
//public class ExamThread {
//   public static void main(String[] args) {
//       Threading1 t1=new Threading1();
//       Threading11 t2=new Threading11();
//       t2.start();
//       t1.start();
//   }
//}
//

//
//
//public class Examplestatic {
//    public static void msg() {
//        System.out.println("This is a static method.");
//    }
//
//    public static void main(String[] args) {
//    	
//    	//here we dont need to create object
//        msg();
//    }
//}




//public class ArraySearch {
//
//    public static void main(String[] args) {
//        int[] arr = { 10, 5, 20, 15, 25, 30 };
//        
//        
//        int n = 15;
//        int in=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == n) {
//                in = i; 
//                break; 
//            }
//        }
//        if (in != -1) {
//            System.out.println("found index at "+in);
//        } else {
//            System.out.println("not found ");
//        }
//    }
//}



//public class student {
//    private String name;
//    private int age;
//    private String gender;
//
//    public student(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age >= 0 && age <= 150) { 
//            this.age = age;
//        } else {
//            System.out.println("Invalid age!");
//        }
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//}
//public class ES {
//    public static void main(String[] args) {
//        student p = new student("kiran", 22, "Male");
//        System.out.println("Name: " + p.getName());
//        System.out.println("Age: " + p.getAge());
//        System.out.println("Gender: " + p.getGender());
//
//    }
//}
