package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;

/**
 * Adding groups of elements to Collection objects.
 */
public class AddingGroups {
	public static void main(String[] args){
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts={6,7,8,9,10};

		collection.addAll(Arrays.asList(moreInts));

		// Run significantly faster,but you can't construct a Collection this way
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection,moreInts);

		//Produce a list "backed by" an array
		List<Integer> list=Arrays.asList(16,17,18,19,20);
		list.set(1,99);
		print(collection);
		print(list);
	}
}
