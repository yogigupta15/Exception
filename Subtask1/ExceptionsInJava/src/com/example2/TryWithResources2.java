package com.example2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources2 {

	public static void main(String[] args) throws IOException {
		
		File fileIn = new File("C:\\Users\\251636\\Desktop\\java\\Quote.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileIn))){
			
			String st  = null;
			
			while((st = br.readLine()) != null) {
				
				System.out.println(st);
			}
		} catch(IOException e) {
			
			System.out.println("Catch and handle exception: " + e);
		}
	}
}
