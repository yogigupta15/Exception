package com.example;

public class MultipleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		int numArray[] = {10,20,30,40,50};
		
		try {
			numArray[4] = 70/0;
			System.out.println(numArray[5]);
			
		} catch(ArithmeticException ae) {
			
			System.out.println("Caught ArithmaticException");
			
		} catch(ArrayIndexOutOfBoundsException ai) {
			
			System.out.println("Caught ArrayOutOfBoundExceptions");
		}
		System.out.println("End of the program");
   }

}
