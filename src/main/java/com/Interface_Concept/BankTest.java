package com.Interface_Concept;

public class BankTest {

	public static void main(String[] args) {
		SBIbank obj = new SBIbank();
		obj.AccountCreation();
		obj.CarLoans();
		obj.Checkbook();
		obj.DebitCard();
		obj.HomeLoans();
		obj.Insurence();
		obj.MobileBanking();
		obj.NetBanking();
		obj.Passbook();
		System.out.println(ReserveBank.min_bal);
		
		System.out.println("*************");
		
		ReserveBank rb = new SBIbank();
		rb.DebitCard();
		rb.AccountCreation();
		rb.Passbook();
		System.out.println(ReserveBank.min_bal);
		
		System.out.println("*********************");		
		USbank usbank = new SBIbank();
		usbank.Checkbook();
		usbank.MobileBanking();
		usbank.NetBanking();
		
	}

}
