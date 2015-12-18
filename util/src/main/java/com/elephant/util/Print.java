package com.elephant.util;

import java.io.PrintStream;
import java.util.Objects;

/**
 * My own class library
 * Print()
 *
 */
public class Print {
	//Print with newline
	public static void print(Object obj){
		System.out.println(obj);
	}
	//Print a newline by itself
	public static void print(){
		System.out.println();
	}
	//Print with no line break
	public static void printnb(Objects obj){
		System.out.print(obj);
	}
	//The new Java SE5 printf() (from C)
	public static PrintStream
	printf(String format,Objects... args){
		return System.out.printf(format,args);
	}
}
