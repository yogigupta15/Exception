package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownExceptions2 {

	public static void main(String[] args) {

		readFileA();
	}

	public static void readFileA() {

		readFileB();
	}

	public static void readFileB() {

		try {

			File file = new File("path.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));

			String st = br.readLine();

			while (st != null) {
				System.out.println(st);
				st = br.readLine();
			}
			br.close();

		} catch (IOException e) {

			System.out.println("Catch the exception in order to handle it. " + e);
		}
	}
}
