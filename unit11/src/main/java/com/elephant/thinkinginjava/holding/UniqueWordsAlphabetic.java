package com.elephant.thinkinginjava.holding;
// Priducing an alphabetic listing
import java.util.*;
import com.elephant.util.*;

public class UniqueWordsAlphabetic {
	public static void main(String[] args){
		Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("src/main/java/com/elephant/thinkinginjava/holding/SetOperations.java","\\W+"));
		System.out.println(words);
	}
}
