package com.elephant.thinkinginjava.holding;
import java.util.*;

public class ModifyingArrayAsList {
	public static void main(String[] args){
		Random random=new Random(47);
		Integer[] ia={1,2,3,4,5,6,7,8,9,10};
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("Before shuffling: "+list1);

		Collections.shuffle(list1,random);
		System.out.println("After shuffling: "+list1);

		System.out.println("array: "+Arrays.toString(ia));

		List<Integer> list2=Arrays.asList(ia);
		System.out.println("Before shuffling: "+list2);

		Collections.shuffle(list2,random);
		System.out.println("After shuffling: " + list2);
		System.out.println("array: "+Arrays.toString(ia));
	}
}
