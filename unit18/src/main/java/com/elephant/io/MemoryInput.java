package com.elephant.io;
import java.io.*;
/**
 * Created by elephant on 16/4/10.
 */
public class MemoryInput {
	public static void main(String[] args) throws IOException{
		StringReader in=new StringReader(BufferedInputFile.read("/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/src/main/java/com/elephant/io/DirList.java"));
		int c;
		while ((c=in.read())!=-1)
			System.out.print((char)c);
	}
}
