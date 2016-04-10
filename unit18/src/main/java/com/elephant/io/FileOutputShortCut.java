package com.elephant.io;
import java.io.*;
/**
 * Created by elephant on 16/4/10.
 */
public class FileOutputShortCut {
	static  String file="/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/BasicFileOutput1";
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("/Users/elephant/dev/github_codes/Thinking_In_Java/unit18/src/main/java/com/elephant/io/FileOutputShortCut.java")));
// Here is the shortcut
		PrintWriter out=new PrintWriter(file);
		int lineCount=1;
		String s;
		while ((s=in.readLine())!=null)
			out.println(lineCount++ +": "+s);
		out.close();
// show stored file
		System.out.println(BufferedInputFile.read(file));
	}
}
