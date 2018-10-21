package com.Abstraction;

public abstract class Abstract_Class {
	
	/*Abstraction is nothing but Hiding the Data implementation ad Highlighting the set of services is known as Abstraction
	 * we can not achieve 100% Abstraction through Abstract classes,
	 * but 100% Abstraction is possible through interface, Because
	 * Interface Doesn't have Main Method.
	 * Interface Doesn't have Method Body (only deceleration of the Method no need to write entire method)
	 * In interface we can declare the variables, Variables are by Default static in Nature.
	 * Value of the variables will not be changed.Final/Constant in Nature
	 * No Static Methods in Interface because Interface is a part of Object Oriented Programming Concept, It is a part of Objects,
	 * Objects can not have a static methods, thats'y we never write Static methods.
	 * 
	 *  we can not create object of interface because Interface is Abstract in nature.
	 * 
	 * when we are defining at least one method as Abstract Method then it is compulsory to define class as Abstract  
	 * Abstract class can have both Abstract Methods and NoN Abstract Methods.
	 * only Method deceleration no Method Body
	 * for Abstract Methods we can not create an object.
	 * 
	 * */
	
	
	/*
	 * Partial Abstraction
	 * */
	public abstract  void job();//only Method deceleration no Method Body
	
	public abstract void marriage();
	
	public void status() {// Non-Abstract Method
		System.out.println("Parents ");
	}

}
