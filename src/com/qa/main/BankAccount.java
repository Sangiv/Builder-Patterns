package com.qa.main;

public class BankAccount {
	private int accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;
	
	public BankAccount() {
		
	}

	public BankAccount(int accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}

}