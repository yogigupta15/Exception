package com.example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try{
			
			File fileIn = new File("C:\\Users\\251636\\Desktop\\java\\Quotes.txt");
			File fileOut = new File("C:\\Users\\251636\\Desktop\\java\\newfile.txt");
			
			br = new BufferedReader(new FileReader(fileIn));
			bw = new BufferedWriter(new FileWriter(fileOut));
			
			bw.write("This is a copy! \n\n");
			
			String st = null;
			
			while((st = br.readLine()) != null) {
				
				System.out.println(st);
				bw.write(st + "\n");  
			}
		} finally {
			
			br.close();
			bw.close();
		}
	}
}
