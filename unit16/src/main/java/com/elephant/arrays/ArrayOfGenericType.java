package com.elephant.arrays;

/**
 * Arrays of generic types won't compile
 */
public class ArrayOfGenericType<T> {
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size){
		array=(T[])new Object[size];
	}
}
