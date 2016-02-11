package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

/**
 *	Modify SimpleController.java , use a Set to c
 */

public class Exercise2 {
	public static void main(String[] args){
	Collection<Integer> c=new HashSet<Integer>();
	for(int i=0;i<10;i++)
		c.add(i);//Autoboxing
	// c.add(1);
	for (Integer i:c)
		printnb(i+", ");
	}
}