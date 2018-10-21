package com.OPPS1;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*Arrays are Index Based 
		 * Arrays are fixed in Size (Static Array) 
		 * to over come this disadvantage we will use collections concept, ArrayList(Dynamic Array)
		 * 
		 *  Array Stores only similar Data Types
		 *  to over come this we will use Object Array where we can use different data types*/
		int array [] = new int[4];
		array[0]= 77;
		array[1]=66;
		array[2]=777;
		array[3]=666;
		System.out.println(array.length);
		System.out.println(array[2]);
		System.out.println(array[1]);
		
		
//		Exception is ArrayIndexOutOfBoundsException:
		System.out.println(array[6]);
		
		for (int i = 0; i < array.length-1; i++) {
			System.out.println("Values in the array is: "+array[i]);
			
		}

	}

}
