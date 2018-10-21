package FFF;

public class Finalize_concept {
	
	public void finalize() {
		System.out.println("Finalize is a method ");
	}
	
	//Finalize is the method which is used to clean up processing of the Object

	public static void main(String[] args) {
		
		/*Garbage collector will come and destroys all the Objects which doesn't have the reference variables to refer the Object
		 * Garbage collector will come and destroys Automatically to free some space memory 
		 * 
		 * to call Garbage collector manually System.gc().
		 *  */
		
		Finalize_concept fz = new Finalize_concept();
		Finalize_concept fz1 = new Finalize_concept();
		fz=null;
		fz1=null;
		
		System.gc();
		/*
		 * Runs the garbage collector. Calling the gc method suggests that the Java VirtualMachine expend effort toward recycling unused objects 
		 * in order to make the memory they currently occupy available for quick reuse.
			When control returns from the method call,
 			the Java VirtualMachine has made a best effort to reclaim space from all discardedobjects. 
*/

	}

}
