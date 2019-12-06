package com.test.smallest.number;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
	public static final String INPUT_FILE_PATH = System.getProperty("user.dir") + "/src/example2.txt";

	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_PATH));

		String i;
		while (bufferedReader.readLine() != null) {
			String line = bufferedReader.readLine();
			System.out.println(line);
		}
	}
}
