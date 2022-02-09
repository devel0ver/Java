package com.ahmed.BankAccount;

public class BankAccount {
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private static int numberOfAccounts = 0;
	private static double bankTotalAmount = 0;
	
	public BankAccount() {
		bankTotalAmount = 0;
		numberOfAccounts++;
	}
	
	public BankAccount(double checking, double savings) {
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		bankTotalAmount += checking + savings;
		numberOfAccounts++;
	}
	
	
	public double getCheckingBalance() {
		return checkingBalance;
		
	}



	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance += checkingBalance;
	}



	public double getSavingsBalance() {
		return savingsBalance;
	}



	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}



	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static double getBankTotalAmount() {
		return bankTotalAmount;
	}
	
	public void depositMoney(double amount, String accountType, String name) {
		if(accountType.equals("Checking") ) {
			this.checkingBalance += amount;
			BankAccount.bankTotalAmount += amount;
			System.out.printf("Deposited $%.2f to %s's %s account\n", amount, name, accountType);
		}else if(accountType.equals("Saving")) {
			this.savingsBalance += amount;
			BankAccount.bankTotalAmount += amount;
			System.out.printf("Deposited $%.2f to %s's %s account\n", amount, name, accountType);
		}else {
			System.out.println("\nPlease enter a valid account type!\n");
		}
	}
	
	public void withdrawMoney(double amount, String accountType, String name) {
		if(accountType.equals("Checking") && amount <= this.checkingBalance) {
			this.checkingBalance -= amount;
			BankAccount.bankTotalAmount -= amount;
			System.out.printf("Withdrew $%.2f from %s's %s account", amount, name, accountType);
		}else if(accountType.equals("Saving") && amount <= this.savingsBalance) {
			this.savingsBalance -= amount;
			BankAccount.bankTotalAmount -= amount;
			System.out.printf("Withdrew $%.2f from %s's %s account\n", amount, name, accountType);
		}else if(accountType.equals("Checking") || accountType.equals("Saving") && amount > this.checkingBalance || amount > this.savingsBalance){
			System.out.println("\nInsufficient fund!!\n");
		}else {
			System.out.println("\nPlease enter a valid account type!\n");
		}
	}
	
}
