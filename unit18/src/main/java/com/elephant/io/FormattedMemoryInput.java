package com.elephant.io;
import java.io.*;
/**
 * Created by elephant on 16/4/10.
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try {
			DataInputStream in=new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read("/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/src/main/java/com/elephant/io/FormattedMemoryInput.java").getBytes()));
			while (true)
				System.out.print((char)in.readByte());
		} catch (EOFException e){
			System.err.println("Enf of Stream");
		}
	}
}
