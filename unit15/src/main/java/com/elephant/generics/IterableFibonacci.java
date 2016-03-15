package com.elephant.generics;
import java.util.*;
/**
 * Adapt the Fibnacci class to make it Iterable
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
	private int n;
	public IterableFibonacci(int n){this.n=n;}
	// Implement Iterable interface
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n>0;
			}

			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
		};
	}


	public static void main(String[] args){
		for (int i : new IterableFibonacci(10))
			System.out.println(i);
	}

}
