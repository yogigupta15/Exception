package com.example3;

import java.util.Scanner;

public class ThrowExceptions1 {

	public static void main(String[] args) {
		
		checkAgeForExamEligibility();
	}

	private static void checkAgeForExamEligibility() throws IllegalArgumentException{

		System.out.println("Enter your age to check for exam Eligibility: ");

		Scanner scan = new Scanner(System.in);

		int age = scan.nextInt();

		scan.close();
		if (age < 21 || age > 35) {

			throw new IllegalArgumentException("Sorry you are not eligible for the exam.");

		} else {

			System.out.println("You are in the right age range to give this exam.");
		}
	}
}
