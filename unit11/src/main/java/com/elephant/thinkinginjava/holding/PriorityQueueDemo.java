package com.elephant.thinkinginjava.holding;
import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args){
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
		Random random=new Random(47);
		// Use offer to fill queue
		for (int i=0;i<10;i++)
			priorityQueue.offer(random.nextInt(i+10));
		QueueDemo.printQ(priorityQueue);

		// Use List to fill queue
		List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priorityQueue=new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);

		// Use List to fill queue
		// Order the elements according to the specified comparator
		priorityQueue=new PriorityQueue<Integer>(
			ints.size(),Collections.reverseOrder()
		);
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);

		// Use List to fill queue
		String fact="EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings=Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ=new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);

		// Use List to fill queue
		// Order the elements according to the specified comparator
		stringPQ=new PriorityQueue<String>(
			strings.size(),Collections.reverseOrder()
		);
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);

		// Uset Set to fill queue
		// no repeat element
		Set<Character> charSet=new HashSet<Character>();
		for (char c : fact.toCharArray())
			charSet.add(c); //Autoboxing
		PriorityQueue<Character> characterPQ=new PriorityQueue<Character>(charSet);
		QueueDemo.printQ(characterPQ);
	}
}
