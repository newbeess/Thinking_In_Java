package com.elephant.strings;
import java.util.regex.*;
import java.util.*;
import static com.elephant.util.Print.*;

public class SplitDemo {
	public static void main(String[] args){
		String input="This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		// Only do the first three
		print(Arrays.toString(Pattern.compile("!!").split(input,3)));
	}
}
