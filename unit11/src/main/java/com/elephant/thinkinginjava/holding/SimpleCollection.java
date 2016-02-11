package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Simple Collection
 */
public class SimpleCollection {
	public static void main(String[] args){
		Collection<Integer> c=new ArrayList<Integer>();
		for (int i=0;i<10;i++)
			c.add(i);
		//c.add(1)；
		for (Integer i:c)
			printnb(i+", ");
	}
}
