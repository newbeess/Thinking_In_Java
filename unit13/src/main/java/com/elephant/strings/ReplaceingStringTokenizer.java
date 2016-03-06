package com.elephant.strings;
import java.util.*;

public class ReplaceingStringTokenizer {
	public static void main(String[] args){
		String input="But I'm not dead yet! I feel happy!";
		StringTokenizer stoker=new StringTokenizer(input);
		while (stoker.hasMoreElements())
			System.out.print(stoker.nextToken() + " ");
		System.out.println();

		System.out.println(Arrays.toString(input.split(" ")));

		Scanner scanner=new Scanner(input);
		while (scanner.hasNext())
			System.out.print(scanner.next() + " ");
	}
}
