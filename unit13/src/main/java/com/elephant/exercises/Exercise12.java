package com.elephant.exercises;
import java.util.HashSet;
import java.util.*;
import java.util.regex.*;
import static com.elephant.util.Print.*;

public class Exercise12 {
	public static final String POEM=
			"Twas brillig, and the slithy toves.\n"+
					"Did gyre and gimble in the wabe.\n"+
					"All mimsy were the borogoves,\n"+
					"And the mome raths outgrabe.\n\n"+
					"Beware the Jabberwock, my son,\n"+
					"The jaws that bite, the claws that catch.\n"+
					"Beware the Jubjub bird, and shun\n"+
					"The frumious Bandersnatch.";
	public static void main(String[] args){
		Set<String> words=new HashSet<String>();
		Matcher m=Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(POEM);
		while (m.find())
			words.add(m.group(1));
		print("word number= "+words.size());
		print(words.toString());

	}
}
