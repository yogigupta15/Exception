package com.example1;

public class Finally1 {

	public static void main(String[] args) {
		
		String s[] = {"Gavin", "Kristen","Rebecca"};
		
		try {
			for(int i =0; i <=3; i++) {				
				System.out.println(s[i] + ": " + s[i].length());				
			}
			
		} catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("Caught ArrayIndexOutBoundsException");
			
		} finally {
			
			System.out.println("In the finally block");
			System.out.println("This code will always be Executed");
		}
		
		System.out.println("End of program");
	}
}
