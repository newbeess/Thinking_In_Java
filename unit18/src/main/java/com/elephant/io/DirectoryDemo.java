package com.elephant.io;

import java.io.*;
import com.elephant.util.*;
import static com.elephant.util.Print.*;
/**
 * Simple use of Directory utilities
 */
public class DirectoryDemo {
	public static void main(String[] args){
// All directories
		PPrint.pprint(Directory.walk(".").dirs);
		print("---------------------");
// All File begining with 'D'
		for (File file : Directory.local("./src/main/java/com/elephant/io/","D.*"))
			print(file);
		print("---------------------");
// All Java files begining with 'D'
		for (File file : Directory.local("./src/main/java/com/elephant/io/","D.*\\.java"))
			print(file);
		print("---------------------");
// Class files containing "Z" or z
		for (File file : Directory.walk(".",".*[e].*\\.java"))
			print(file);
	}
}
