package com.Interface_Concept;

public class SBIbank implements ReserveBank, USbank {
	
	public void Insurence() {
		System.out.println("Health Insurance");
	}
	
	public void HomeLoans() {
		System.out.println("SBI HomeLoans ");
	}
	
	public void CarLoans() {
		System.out.println("SBI Car Loans ");
	}

	
	public void DebitCard() {
		System.out.println("Applied Debit card for transtation ");		
	}

	
	public void Passbook() {
		System.out.println("Passbook Mandatory");
		
	}

	public void AccountCreation() {
		System.out.println("Account Creation");
		
	}

	public void Checkbook() {
		System.out.println("Check book ");
		
	}

	public void NetBanking() {
		System.out.println("Net Banking");
		
	}

	public void MobileBanking() {
		System.out.println("Mobile Banking ");
		
	}

}
