package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * All collections work with foreach
 */

public class ForEachCollections {
	public static void main(String[] args){
		Collection<String> cs=new LinkedList<String>();
		Collections.addAll(cs,"Yesterday once more".split(" "));
		for (String s : cs)
			System.out.print(s+", ");
	}
}
