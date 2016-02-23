package com.elephant.thinkinginjava.holding;
import java.util.*;
import com.elephant.util.*;

public class UniqueWords {
	public static void main(String[] args){
		Set<String> words=new TreeSet<String>(
			new TextFile("src/main/java/com/elephant/thinkinginjava/holding/SetOperations.java","\\W+"));
		System.out.println(words);
	}
}
