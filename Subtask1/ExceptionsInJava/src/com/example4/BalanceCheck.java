package com.example4;

import java.util.Scanner;

public class BalanceCheck {

	private static int accountBalance = 1000;

	public static void main(String[] args) {
		
			System.out.println("Enter the amount to withdraw: ");
			
			Scanner withdrawInput = new Scanner(System.in);
			
			int withdrawAmt = withdrawInput.nextInt();
			
			withdrawInput.close();

			if (withdrawAmt > accountBalance) {

				throw new InsufficientBalanceException("Insufficient Balance");

			}
			System.out.println("Withdrawl Successful");
	}
}
