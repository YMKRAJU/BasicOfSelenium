package com.Abstraction;

public class Abstraction_Test {

	public static void main(String[] args) {
		Child_Abstract ca = new Child_Abstract();
		ca.marriage();
		ca.status();
		ca.job();
		ca.time(); 
		
		System.out.println("**************");
		
		Abstract_Class ab = new Child_Abstract();
		ab.job();
		ab.marriage();
		ab.status();
		//ab.time(); this in Method of child class so parent class doesn't have access 
		

	}

}
