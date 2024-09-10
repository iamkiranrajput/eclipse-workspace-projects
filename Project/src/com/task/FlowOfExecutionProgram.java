package com.task;
class Student11{
	String name="kirna";
	long id= 123;
	
}
public class FlowOfExecutionProgram {

    int i= 10;
    {
        m1();
        System.out.println("first instance block");
    }
    int j=20;

     FlowOfExecutionProgram(){
    	 System.out.println(j);
        System.out.println("constructor");
    }
    public static void main(String[] args) {
    	FlowOfExecutionProgram f =new FlowOfExecutionProgram();
    	System.out.println("main");
    }


    public void m1() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    	
    	Class c=Class.forName("Student11");
    	
    	Student11 s=(Student11) c.newInstance();
  
    	System.out.println(s.id);
        System.out.println(j);
    }
}