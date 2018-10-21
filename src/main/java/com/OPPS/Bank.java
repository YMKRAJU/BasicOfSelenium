package com.OPPS;

public interface Bank {
	
	/*Interface Doesn't have Main Method.
	 * Interface Doesn't have Method Body (only deceleration of the Method no need to write entire method)
	 * Interface is the Keyword for INTERFACE.
	 * In interface we can declare the variables, Variables are by Default static in Nature.
	 * Value of the variables will not be changed.Final/Constant in Nature
	 * No Static Methods in Interface because Interface is a part of Object Oriented Programming Concept, It is a part of Objects,
	 * Objects can not have a static methods, thats'y we never write Static methods.
	 * 
	 *  we can not create object of interface because Interface is Abstract in nature.  */
	static int min_Balance = 3000;
	public void Cridet();
	public void  Debit();
	public void NetBanking();
//	public void MobileBanking();	
}
