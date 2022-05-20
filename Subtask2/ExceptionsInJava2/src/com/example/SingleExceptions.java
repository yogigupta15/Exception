package com.example;

public class SingleExceptions {

	public static void main(String[] args) {
		
		int num1 = 1;
		try {
			System.out.println("Start of the program");
			System.out.println("num1/0 : " + (num1 / 0));
			
		} catch (ArithmeticException ae) {
			
			ae.printStackTrace();
		}	
		System.out.println("End of the program");
	}

}
