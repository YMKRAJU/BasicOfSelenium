package com.OPPS;

public class Bank_Test {

	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.Cridet();
		obj.Debit();
		obj.MobileBanking();
		obj.NetBanking();
		System.out.println(Bank.min_Balance);
		
		System.out.println("*************");
		
		Bank obj1 = new SBI();
		obj1.Cridet();
		obj1.Debit();
		obj1.NetBanking();
		
		
		System.out.println("***************");
		Reserve_Bank obj2 = new SBI();
		obj2.Current_Account();
		obj2.Savings_Account();

	}

}
