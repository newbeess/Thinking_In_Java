package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 *
 */

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();

		for (int i=0;i<3;i++)
			apples.add(new Apple());

		//Compile-time error
		//! apples.add(new Orange());

		for (int i=0;i<apples.size();i++)
			print(apples.get(i).id());

		//Using foreach
		for (Apple a:apples)
		print(a.id());
	}
}
