package com.elephant.io;
import java.io.*;
/**
 * Testing for end for end of file while reading a byte at a time.
 */
public class TestEOF {
	public static void main(String[] args) throws IOException{
		DataInputStream in=new DataInputStream(
			new BufferedInputStream(
					new FileInputStream("/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/src/main/java/com/elephant/io/TestEOF.java")));
		while (in.available() !=0)
			System.out.print((char)in.readByte());
	}
}
