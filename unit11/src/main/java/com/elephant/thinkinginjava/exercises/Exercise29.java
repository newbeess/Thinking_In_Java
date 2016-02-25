package com.elephant.thinkinginjava.exercises;

import java.util.*;

/**
 * Created by elephant on 16/2/25.
 */
class A extends Object{}

public class Exercise29 {
	public static void main(String[] args){
		PriorityQueue<A> queue=new PriorityQueue<A>();
		queue.offer(new A());
		queue.offer(new A());
	}
}
