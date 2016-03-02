package com.elephant.exceptions;
import java.io.*;

public class MainException {
	// Pass all exception to the consle
	public static void main(String[] args) throws Exception{
		// Open the file:
		FileInputStream file=new FileInputStream("MainException.java");
		// Use the file...
		// Close the file
		file.close();
	}
}
