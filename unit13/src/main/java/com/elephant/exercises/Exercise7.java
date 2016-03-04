package com.elephant.exercises;


public class Exercise7 {
	static String s1="Hala madrid";
	static String s2="hala madrid.";
	static String s3="hala madrid";
	static String s4="Hald madrid.";
	public static void main(String[] args){
		String regex="\\p{javaUpperCase}.*\\.";
		System.out.println(s1.matches(regex));
		System.out.println(s2.matches(regex));
		System.out.println(s3.matches(regex));
		System.out.println(s4.matches(regex));

	}
}
