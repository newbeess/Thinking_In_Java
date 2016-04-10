package com.elephant.io;
import java.io.*;
/**
 * Created by elephant on 16/4/10.
 */
public class BufferedInputFile {
// Throw exceptions to console
	public static String read(String filename) throws IOException{
// Reading input by line
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb=new StringBuilder();
		while ((s=in.readLine())!=null)
			sb.append(s+"\n");
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException{
		System.out.println(read("/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/src/main/java/com/elephant/io/DirList.java"));
	}
}
