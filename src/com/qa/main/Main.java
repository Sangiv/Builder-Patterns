package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
		
		BankAccount first = new BankAccountBuilder()
			.buildAccountNumber(100)
			.buildBalance(100)
			.buildBranch("somewhere")
			.buildInterestRate(0.01)
			.buildOwner("person")
			.build();
			
		System.out.println(first);
		
	}

}
