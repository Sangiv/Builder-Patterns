package com.qa.main;

public class BankAccountBuilder {
	
	private int accountNumber = 0;
	private String owner = "test";
	private String branch = "any";
	private double balance = 0.00;
	private double interestRate = 0.01;

	
	public BankAccountBuilder() {
		
	}
	
	public BankAccount build() {
		return new BankAccount(accountNumber, owner, branch, balance, interestRate);
	}
	
	public BankAccountBuilder buildAccountNumber(int acno) {
		this.accountNumber = acno;
		return this;
	}
	public BankAccountBuilder buildOwner(String own) {
		this.owner = own;
		return this;
	}
	public BankAccountBuilder buildBranch(String bra) {
		this.branch = bra;
		return this;
	}
	public BankAccountBuilder buildBalance(double bal) {
		this.balance = bal;
		return this;
	}
	public BankAccountBuilder buildInterestRate(double inte) {
		this.interestRate = inte;
		return this;
	}
	
	
}
