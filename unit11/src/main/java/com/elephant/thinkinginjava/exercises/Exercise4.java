package com.elephant.thinkinginjava.exercises;

import static com.elephant.util.Print.*;
import java.util.*;

/**
 *	Create a generator class to produces String objects with the names of characters from your favorite movie
 * each time you call next(). and then loops around to the beginning of the character list when it runs out of names.
 * Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet,
 * then print each container.
 */


class MovieNameGenerator  {
	static String[] characters={
			"Grumpy","Happy","Sleepy","Dopey","Doc","Sneezy",
			"Bashful","Snow White","Witch Queen","Prince"
	};
	private static Random random=new Random(47);
	static int next;
	public static String next(){
		String s=characters[next];
		next=(next+1)%characters.length;
		return s;
	}
}

public class Exercise4 {
	private static final MovieNameGenerator mng=new MovieNameGenerator();

	static String[] fill(String[] array){
		for (int i=0;i<array.length;i++)
			array[i]=mng.next();
		return array;
	}

	static Collection<String> fill(Collection<String> collection){
		for (int i=0;i<5;i++)
			collection.add(mng.next());
		return collection;
	}

	public static void main(String[] args){
		print(Arrays.toString(fill(new String[5])));
		//List
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		//Set
		print(fill(new HashSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new TreeSet<String>()));
	}
}
