package com.elephant.io;
import java.io.*;
/**
 * Turn System out into a PrintWriter
 */
public class ChangeSystemOut {
	public static void main(String[] args){
		PrintWriter out=new PrintWriter(System.out,true);
		out.println("Hello World");
	}
}
