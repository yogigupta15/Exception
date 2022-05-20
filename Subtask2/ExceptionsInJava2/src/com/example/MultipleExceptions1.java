package com.example;

public class MultipleExceptions1 {
	
	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		int numArray[] = {10,20,30,40,50};
		
		for(int i = 0; i <= numArray.length; i++) {
			
			try {
				System.out.println("i = " + i);
				System.out.println("numArray[i] / i");
				System.out.println(numArray[i] / i);
				
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				
				System.out.println("\nCaught Some Exception, which one is it? " + e.getClass());			
			}
		}
		System.out.println("\nEnd of the program");
	}
}
