package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

class Command1{
	String s;
	Command1(String string){s=string;}
	public void  operation1(){
		print(s);
	}
}

class Command2{
	public Queue<Command1> operation2(int size) {
		Queue<Command1> queue = new LinkedList<Command1>();
		if (size < 0) {
			print("Queue Size Must be bigger than 0.");
			return queue;
		}
		for (int i = 0; i < size; i++) {
			String s="a"+i;
			queue.offer(new Command1(s));
		}
		return queue;
	}
}
public class Exercise27 {
	public static void operation3(Queue<Command1> queue){
		while (queue.peek()!=null){
			Command1 member=queue.remove();
			member.operation1();
		}
	}
	public static void main(String[] args){
		Command2 cm2=new Command2();
		Queue<Command1> queue=cm2.operation2(10);
		operation3(queue);
	}
}
