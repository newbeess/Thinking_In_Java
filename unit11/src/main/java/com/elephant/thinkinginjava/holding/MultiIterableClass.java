package com.elephant.thinkinginjava.holding;
import java.util.*;
/**
 * Adding several Adapter Methods
 */

public class MultiIterableClass extends IterableClass{
	public Iterable<String> reversed(){
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					int current=words.length-1;
					public boolean hasNext() {
						return current>-1;
					}
					public String next() {
						return words[current--];
					}
					public void remove(){
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				List<String> shuffled=new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled,new Random(47));
				return shuffled.iterator();
			}
		};
	}
	public static void main(String[] args){
		MultiIterableClass mic=new MultiIterableClass();
		for (String s : mic.reversed())
			System.out.print(s+" ");
		System.out.println();
		for (String s : mic.randomized())
			System.out.print(s+" ");
		System.out.println();
		for (String s : mic)
			System.out.print(s+" ");
		System.out.println();
	}
}
