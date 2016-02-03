package com.elephant.innerclasses.exercises;

import static com.elephant.util.Print.*;

/**
 * 	Create a class , it has a String member and toString memthod which display it.
 * 	Add some objects to Sequence object and display.
 */
class StringHolder{
	String s;
	StringHolder(String s){this.s=s;}
	public String toString() {return s;}
}

public class Exercise2 {
	public static void main(String[] args){
		Sequence sequence=new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(new StringHolder(Integer.toString(i)));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			printnb(selector.current() + " ");
			selector.next();
		}
	}
}



interface Selector{
	boolean end();
	Object current();
	void next();
}

 class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}
	// innerclass can use items[]
	// items[] is the member of outer class
	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}
		public Object current(){return items[i];}
		public void next(){if (i<items.length) i++;}
	}
	public Selector selector(){return new SequenceSelector();}
}