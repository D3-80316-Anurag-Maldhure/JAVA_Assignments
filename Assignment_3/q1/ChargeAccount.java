package q1;

import java.util.Scanner;

public class ChargeAccount {
	long accountNumber;
	int pendingBalanceAtMonthStart;
	int totalAllItemsCharged;
	int totalAllCreditsThisMonth;
	int allowedCreditLimit;
	int newBalanceForNextMonth;
	
	public ChargeAccount() {
		this.accountNumber = 0;
		this.pendingBalanceAtMonthStart = 0;
		this.totalAllItemsCharged = 0;
		this.totalAllCreditsThisMonth = 0;
		this.allowedCreditLimit = 0;
		this.newBalanceForNextMonth = 0;
	}
	
	public void acceptChargeAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charge Account Details: ");
		System.out.println("Enter Customer Charge Account number: ");
		this.accountNumber = sc.nextLong();
		System.out.println("Enter Customer Allowed Credit Limit: ");
		this.allowedCreditLimit = sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month: ");
		this.totalAllItemsCharged = sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month: ");
		this.totalAllCreditsThisMonth = sc.nextInt();
		System.out.println("Enter pending balance at the beginning of the month: ");
		this.pendingBalanceAtMonthStart = sc.nextInt();	
		//Calculate balance credit
		newBalanceForNextMonth = pendingBalanceAtMonthStart + totalAllItemsCharged - totalAllCreditsThisMonth;
	}
	
	public void displayChargeAccountDetails() {
		System.out.println("------------------------------------------");
		System.out.println("Customer Details: ");
		System.out.println("Charge account number : " + accountNumber);
		System.out.println("Allowed credit limit : " + allowedCreditLimit);
		System.out.println("Balance available for next month : INR "+newBalanceForNextMonth);
		System.out.println("Pending balance at the beginning of the month: " + pendingBalanceAtMonthStart);
		System.out.println("Total of all items charged by the customer this month: "+totalAllItemsCharged);
		System.out.println("Total of all credits applied to the customer’s account this month: "+ totalAllCreditsThisMonth);
		System.out.println("");
		System.out.println("------------------------------------------");
		
	}
	
	public void checkIfCreditLimitExceeded() {
		if(newBalanceForNextMonth < allowedCreditLimit) {
			System.out.println("No worries! Customer credit limit not exceeded. Available Credit Limit = "+newBalanceForNextMonth);
		}
		else {
			System.out.println("~~~~~~ Credit limit exceeded! ~~~~~~~");
		}
	}
}
