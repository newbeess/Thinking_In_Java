package com.elephant.thinkinginjava.holding;
import java.util.*;


public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib){
		for (T t : ib)
			System.out.print(t + " ");
	}
	public static void main(String[] args){
		test(Arrays.asList(1,2,3));
		String[] strings={"A","B","C"};

		// An Array works in foreach , but it's not Iterable
		//! test(strings);

		// You can explicitly convert it to an Iterable
		test(Arrays.asList(strings));
	}
}
