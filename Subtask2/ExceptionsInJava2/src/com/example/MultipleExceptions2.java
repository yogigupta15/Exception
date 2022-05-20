package com.example;

public class MultipleExceptions2 {

	public static void main(String[] args) {

		System.out.println("Start of the program");

		int numArray[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i <= numArray.length; i++) {

			try {
				System.out.println("i = " + i);
				System.out.println("numArray[i] / i");
				System.out.println(numArray[i] / i);
				
				if(i == 3) {
					Integer.parseInt("somestring");
				}
				
				if(i == 4) {
					String str = null;
					System.out.println(str.toUpperCase());
				}

			} catch (ArithmeticException ae) {

				System.out.println("Caught ArithmaticException");
				
			} catch (ArrayIndexOutOfBoundsException ai) {
				
				System.out.println("Caught ArrayOutOfBoundException");
				
			} catch(Exception e) {
				
				System.out.println("Caught Exception " + e.getClass());
			}
		}
		System.out.println("\nEnd of the program");
	}
}
