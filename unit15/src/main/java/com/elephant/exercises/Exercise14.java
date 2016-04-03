package com.elephant.exercises;

import com.elephant.generics.BasicGenerator;
import com.elephant.generics.CountedObject;
import com.elephant.util.Generator;

/**
 * Created by elephant on 16/4/3.
 */
public class Exercise14 {
	public static void main(String[] args){
		Generator<CountedObject> gen= new BasicGenerator<CountedObject>(CountedObject.class);
		for (int i=0;i<5;i++)
			System.out.println(gen.next());
	}
}
