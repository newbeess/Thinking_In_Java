package com.elephant.generics;
import java.util.*;
/**
 * Created by elephant on 16/4/4.
 */
public class CompilerIntelligence {
	public static void main(String[] args){
		List<? extends Fruit> flist=Arrays.asList(new Apple());
		Apple a=(Apple)flist.get(0);

		System.out.println(flist.contains(new Apple()));
		System.out.println(flist.indexOf(new Apple()));
	}
}
