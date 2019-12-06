package com.test.smallest.number;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @param qazzeh
 */
public class Solution {
	public static final String INPUT_FILE_PATH = System.getProperty("user.dir") + "/src/example2.txt";
    Scanner s= new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Map<String, Object> arrays = new HashMap<String, Object>();
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_PATH));
		String line;
		String i;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains(" ")) {
				String oldline = line;
				i = bufferedReader.readLine();
				arrays.put(i, oldline);
			}
		}
		bufferedReader.close();
		for (Map.Entry<String, Object> entry : arrays.entrySet()) {
			String key = entry.getKey();
			int[] array = getArray((String) entry.getValue());
			int[] finalArray = sortArray(array);
			int targetIndex = Integer.valueOf(key);
			System.out.println(finalArray[targetIndex - 1]);
		}
	}

	private static int[] sortArray(int[] arrayName) {
		int temp;
		for (int i = 0; i < arrayName.length; i++) {
			if (i != arrayName.length - 1) {
				if (arrayName[i] > arrayName[i + 1]) {
					temp = arrayName[i];
					arrayName[i] = arrayName[i + 1];
					arrayName[i + 1] = temp;
					i = -1;
				}
			}
		}
		return arrayName;
	}

	private static int[] getArray(String value) {

		String[] splited = value.split(" ");
		int arraySize = splited.length;
		int[] array = new int[arraySize];
		String[] val = value.split(" ");
		for (int i = 0; i < val.length; ++i) {
			array[i] = Integer.parseInt(val[i]);
		}
		return array;
	}
}
