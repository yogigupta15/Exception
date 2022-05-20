package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			File file = new File("C:\\Users\\251636\\Desktop\\java\\Quotes.txt");
			br = new BufferedReader(new FileReader(file));

			String st = br.readLine();

			while (st != null) {

				System.out.println(st);
				st = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Exception caught " + e);
		} finally {

			if (br != null) {

				try {

					br.close();

				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println("\n**** Close the bufferd reader in the finally block. ****");

			} else {

				System.out.println("The buffered reader was never opened");
			}
		}
	}
}
