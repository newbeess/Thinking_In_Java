package com.elephant.generics;
import com.elephant.util.*;
/**
 * Created by elephant on 16/4/3.
 */
public class BasicGeneratorDemo {
	public static void main(String[] args){
		Generator<CountedObject> gen=BasicGenerator.create(CountedObject.class);
		for (int i=0;i<5;i++)
			System.out.println(gen.next());
	}
}
