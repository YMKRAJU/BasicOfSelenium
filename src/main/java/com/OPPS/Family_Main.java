package com.OPPS;

public class Family_Main {

	public static void main(String[] args) {
		
		SmallFamily obj = new SmallFamily();
		obj.house();
		obj.Fun();
		obj.house("Old house");
		obj.job();
		obj.Dream();
		
		
		System.out.println("****************");
		
		Family obj1 = new SmallFamily();
		obj1.job();
		obj1.house();
		obj1.house("Home");
		obj1.MStatus();
		
		
		System.out.println("****************");
		
		Family fa = new Family();
		fa.job();
		fa.house();
		fa.house("43 133");
		fa.MStatus();
	}

}
