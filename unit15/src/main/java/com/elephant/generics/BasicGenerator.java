package com.elephant.generics;
import com.elephant.util.Generator;

/**
 * Automatically create a Generator, given a class with a default constructor
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type){this.type=type;}

	public T next() {
		// Assumes type is a public class
		try {
			return type.newInstance();
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	// Produce a Default generator given  a type token
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}
