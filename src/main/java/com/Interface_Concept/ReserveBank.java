package com.Interface_Concept;

public interface ReserveBank {
	
	/*Interface is 100% Abstraction 
	 * Abstract class is also called as Abstraction
	 * Abstract Method :- which doesn't have method body 
	 * Abstraction we can archive in Interface and Abstract Classes also 
	 * In Abstract Classes 0-100% Abstraction is done
	 *  but 1000% Abstraction can be done in Interface*/
	
	int min_bal=3000;
	public void DebitCard();
	public void Passbook();
	public void AccountCreation();
	

}
