package com.elephant.generics;
import java.util.*;

public class GenericVarargs {
	public static <T> List<T> makeList(T... args){
		List<T> resutl=new ArrayList<T>();
		for (T item : args)
			resutl.add(item);
		return resutl;
	}


	public static void main(String[] args){
		List<String> ls=makeList("A");
		System.out.println(ls);
		ls=makeList("A","B","C");
		System.out.println(ls);
		ls=makeList("ABCDEFG".split(""));
		System.out.println(ls);
	}
}
