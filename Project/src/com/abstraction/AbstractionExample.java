package com.abstraction;

public abstract class AbstractionExample {

//	Abstraction 
//	it is hidiing the details and only shhowinng the functionality]
//	abstract keyword use to achive the abstraction
//	Abstraction class cannot be intentiate (we cannot create the objeact of abstract class)
	
	
	
	 static void method() {
	System.out.println("hello im abstract method");
	}
	
	public static void main(String[] args) {
		method();
	
	}

	
	
}

//An abstract class is a class that is declared with an abstract keyword.
//An abstract method is a method that is declared without implementation.
//An abstract class may or may not have all abstract methods. Some of them can be concrete methods
//A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
//Any class that contains one or more abstract methods must also be declared with an abstract keyword.
//There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
//An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.




//Abstraction allows developers to focus on the high-level structure and functionality of an object or system, without getting bogged down by the intricacies of its implementation.
//The internal details of an object's behavior are encapsulated and hidden from the outside world.

//An abstract class is a class that cannot be instantiated on its own and may contain a mix of abstract methods (methods without implementation) and regular methods.



//Interfaces:
//Interfaces provide another way to achieve abstraction in Java.
//An interface is a collection of abstract methods and constant declarations.
//Classes implement interfaces, providing concrete implementations for the methods declared in the interface.

//Focus on What, Not How:
//Abstraction allows developers to focus on what needs to be done rather than how it is done.
//This separation of concerns makes it easier to understand and reason about the overall structure of a program.

