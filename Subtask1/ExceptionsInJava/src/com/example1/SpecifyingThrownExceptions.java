package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownExceptions {

	public static void main(String[] args) throws IOException {
		
		File file = new File("path.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = br.readLine();
		
		while(st != null) {
			System.out.println(st);
			st = br.readLine();
		}
		br.close();
	}

}
