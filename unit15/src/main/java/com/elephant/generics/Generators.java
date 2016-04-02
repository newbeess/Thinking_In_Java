package com.elephant.generics;
import com.elephant.generics.coffee.*;
import java.util.*;
import com.elephant.util.*;

/**
 * Created by elephant on 16/4/2.
 */

public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for (int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
	}



	public static void main(String[] args){
		Collection<Coffee> coffee=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
		for (Coffee c : coffee)
			System.out.println(c);

		Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for (Integer i : fnumbers)
			System.out.print(i+", ");
	}


}
