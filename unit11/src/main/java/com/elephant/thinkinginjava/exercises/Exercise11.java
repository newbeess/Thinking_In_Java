package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Write a method that use an Iterator to step through a Collection and print the toString()
 * of each object in the container.
 * Fill all the different types of Collections with objects and apply your method to each container.
 */
public class Exercise11 {
	public static void printToString(Iterator<?> it){
		while (it.hasNext())
			print(it.next());
	}
	public static void main(String[] args){
		List<Collection<String>> ca=Arrays.<Collection<String>>asList(
				new ArrayList<String>(),
				new LinkedList<String>(),
				new HashSet<String>(),
				new TreeSet<String>()
		);
		for (Collection<String> c : ca)
			Exercise4.fill(c);
		for (Collection<String> c : ca)
			printToString(c.iterator());
	}
}
