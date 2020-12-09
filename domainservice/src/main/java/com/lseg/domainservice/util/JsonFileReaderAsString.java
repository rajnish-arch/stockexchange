package com.lseg.domainservice.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileReaderAsString {

	private JsonFileReaderAsString() {
	}
	static StringBuilder stringBuilder = null;
	static String line = null;
	static String ls = System.getProperty("line.separator");

	public static String getJsonFromFile(String fileName) {
		stringBuilder = new StringBuilder();
		try {
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
		    while ((line= reader.readLine())!=null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
				
			}
		    stringBuilder.deleteCharAt(stringBuilder.length()-1);
		} catch (IOException e) {
			System.out.println("Error while reading the file..."+e.getMessage());
		}
		return stringBuilder.toString();
	}
	
}
