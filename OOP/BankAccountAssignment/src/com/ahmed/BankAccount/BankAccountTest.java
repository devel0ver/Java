package com.ahmed.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount user1 = new BankAccount(295.50, 590.95);
		BankAccount user2 = new BankAccount(1500.40, 2945.90);
		BankAccount user3 = new BankAccount(580, 845.90);
		
		
		
		System.out.println("\n------ Total accounts created --------");
		System.out.println(String.format("\tThere are %s accounts.\n", 				         BankAccount.getNumberOfAccounts()));
		
		user1.depositMoney(300, "Checking", "user1");
		user1.depositMoney(200, "Saving", "user1");
		
		user1.withdrawMoney(350, "Saving", "user1");
		
		user2.withdrawMoney(1200, "Checking", "user2");
		
		System.out.printf("\n\nUser1 Checking balance --> $%.2f, Saving balance --> $%.2f\n", user1.getCheckingBalance(), user1.getSavingsBalance());
		
		System.out.printf("User2 Checking balance --> $%.2f, Saving balance --> $%.2f\n", user2.getCheckingBalance(), user2.getSavingsBalance());
		
		System.out.printf("User3 Checking balance --> $%.2f, Saving balance --> $%.2f\n", user3.getCheckingBalance(), user3.getSavingsBalance());
		
		System.out.printf("\nTotal amount --> $%.2f", BankAccount.getBankTotalAmount());
		
	}
}
