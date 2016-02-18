package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

/**
 * MOdify Exercise1.java
 * Use Iterator to move through calling hop()
 */

public class Exercise8 {
	public static void main(String[] args){
		ArrayList<GerBil> arrayList=new ArrayList<GerBil>();
		for (int i=0;i<10;i++)
			arrayList.add(new GerBil(i));
		Iterator<GerBil> iterator=arrayList.iterator();
		while (iterator.hasNext())
			iterator.next().hop();
	}
}
