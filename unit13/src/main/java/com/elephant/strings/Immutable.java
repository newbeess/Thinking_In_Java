package com.elephant.strings;
import static com.elephant.util.Print.*;

public class Immutable {
	public static String upcase(String s){
		return s.toUpperCase();
	}
	public static void main(String[] args){
		String s1="hello";
		print(s1);
		String s2=upcase(s1);
		print(s2);
		print(s1);
	}
}
