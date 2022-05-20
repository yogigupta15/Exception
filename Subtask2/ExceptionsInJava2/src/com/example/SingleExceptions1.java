package com.example;

public class SingleExceptions1 {
	
	public static void main(String[] args) {
		
		int limit = 10;
		int num = 10;
		
		try {
			while(limit >= 0) {
				
				int res = num / limit;
				System.out.println(num + "/" + limit + ": " + res);
				limit -= 1;
				
			}
		} catch(ArithmeticException ae) {
			System.out.println("Exception Occured");
		}
	}
}
