package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Upcasting to a Queue from a LinkedList.
 */

public class QueueDemo {
	public static void printQ(Queue queue){
		while (queue.peek()!=null)
			printnb(queue.remove() + " ");
		print();
	}
	public static void main(String[] args){
		Queue<Integer> queue=new LinkedList<Integer>();
		Random random=new Random(47);
		for (int i=0;i<10;i++)
			queue.offer(random.nextInt(i+10));
		printQ(queue);

		Queue<Character> qc=new LinkedList<Character>();
		for (char c:"Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
	}
}
