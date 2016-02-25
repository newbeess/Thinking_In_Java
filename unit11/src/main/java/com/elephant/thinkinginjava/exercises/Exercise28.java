package com.elephant.thinkinginjava.exercises;
import java.util.*;

public class Exercise28 {
	public static void main(String[] args){
		Random random=new Random(47);
		PriorityQueue<Double> doublePriorityQueue=new PriorityQueue<Double>();
		for (int i=0;i<10;i++)
			doublePriorityQueue.offer(random.nextDouble());
		for (Object data=doublePriorityQueue.poll();data!=null;data=doublePriorityQueue.poll())
			System.out.print(data+",");

	}
}
