package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

public class Exercise14 {
	public static void main(String[] args){
		LinkedList<Integer> llistI=new LinkedList<Integer>();
		int position;
		ListIterator iterator=llistI.listIterator();
		/**
		for (int i=0;i<10;i++){
			position=llistI.size()/2;
			llistI.add(position,i);
		}
		printnb(llistI);
		**/
		// Use ListIterator to insert
		for (int i=0;i<10;i++){
			iterator.add(i);
			if (i%2==0)
				iterator.previous();
			print(iterator.nextIndex());
		}
		print(llistI);
	}
}
