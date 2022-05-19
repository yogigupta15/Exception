package com.example3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ThrowExceptions3 {

	public static void main(String[] args) {
		try {
			methodWhichThrowsMultipleExceptions();
		} catch(IOException | URISyntaxException e)	{
			System.out.println("Catch and Handle Exception: " + e);
		}
	}
	
	private static void methodWhichThrowsMultipleExceptions() throws IOException, URISyntaxException{
		
		System.out.println("Enter random number: ");
		Scanner inputNum = new Scanner(System.in);
		
		int num = inputNum.nextInt();
		inputNum.close();
		System.out.println("You input the number: " + num);
		
		if(num%2 == 0) {
			throw new IOException("Random IOException for even numbers");
		}else {
			throw new URISyntaxException("some_uri", "Random URISyntaxException for odd numbers");
		}
	}
}
