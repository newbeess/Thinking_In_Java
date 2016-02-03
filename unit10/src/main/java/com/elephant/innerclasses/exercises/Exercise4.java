package com.elephant.innerclasses.exercises;

import static com.elephant.util.Print.*;


public class Exercise4 {
	public static void main(String[] args){
	Sequence1 s1=new Sequence1(1);
	Sequence1.Sequence1Seltctor1 ss1=s1.selector();
	Sequence1 s2=ss1.returnOuter();
	s2.disPaly();
	}
}

interface Seltctor1{
	boolean end();
	Object current();
	void next();
}

 class Sequence1 {
	private Object[] items;
	private int next = 0;

	public Sequence1(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}
	 public void disPaly(){print("Outer.method");}
	// innerclass can use items[]
	// items[] is the member of outer class
	 class Sequence1Seltctor1 implements Seltctor1 {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}
		public Object current(){return items[i];}
		public void next(){if (i<items.length) i++;}
		public Sequence1 returnOuter(){print("inner to outer");return Sequence1.this;}
	}
	public Sequence1Seltctor1 selector(){return new Sequence1Seltctor1();}
	}


