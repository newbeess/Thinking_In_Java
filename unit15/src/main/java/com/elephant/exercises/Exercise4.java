package com.elephant.exercises;
import com.elephant.generics.Fibonacci;

import java.util.*;

class IterableFibonacci implements Iterable<Integer>{
	private Fibonacci fib=new Fibonacci();
	private int n;
	public IterableFibonacci(int n){this.n=n;}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n>0;
			}

			public Integer next() {
				n--;
				return fib.next();
			}
		};
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}
}

public class Exercise4 {
	public static void main(String[] args){
		for (int i : new IterableFibonacci(10))
			System.out.print(i+" ");
	}
}
