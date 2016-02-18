package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

/**
 * Modify innerclasses/Sequence.java
 * Use Iterator instead of Selector
 */
class Sequence{
	private Object[] items;
	private int next;
	public Sequence(int size){items=new Object[size];}
	public void add(Object x){
		if (next<items.length)
			items[next++]=x;
	}
	private class SequenceIterator implements Iterator<Object>{
		private  int i;
		public boolean hasNext(){return i<items.length;}
		public Object next(){
			if (hasNext())
				return items[i++];
			throw new NoSuchElementException();
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}

	public Iterator<Object> iterator(){
		return new SequenceIterator();
	}
}
public class Exercise9 {
	public static void main(String[] args){
		Sequence sequence=new Sequence(10);
		for (int i=0;i<10;i++)
			sequence.add(i);
		for (Iterator<Object> it=sequence.iterator();it.hasNext();)
			printnb(it.next()+",");
	}
}
