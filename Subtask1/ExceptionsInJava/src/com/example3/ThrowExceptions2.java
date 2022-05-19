package com.example3;

import java.util.Scanner;

public class ThrowExceptions2 {
	
	public static void main(String[] args) throws Exception {

		checkAgeForExamEligibility();
	}

	private static void checkAgeForExamEligibility() throws Exception{
		
			System.out.println("Enter your age to check for exam Eligibility: ");
			Scanner scan = new Scanner(System.in);
			int age = scan.nextInt();
			scan.close();
			
			if (age < 21 || age > 35) {

				throw new Exception("Sorry you are not eligible for the exam.");
			}			
			System.out.println("You are in the right age range to give this exam.");
	}
}
