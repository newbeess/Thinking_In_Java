package com.elephant.thinkinginjava.holding;
import typeinfo.pets.*;
import java.util.*;

public class CollectionSequence extends AbstractCollection<Pet>{
	private Pet[] pets=Pets.createArray(8);
	public int size(){return pets.length;}
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index=0;
			public boolean hasNext() {
				return index<pets.length;
			}

			public Pet next() {
				return pets[index++];
			}
			public void remove(){throw new UnsupportedOperationException();}
		};
	}
	public static void main(String[] args){
		CollectionSequence cs=new CollectionSequence();
		InterfaceVsIterator.display(cs);
		InterfaceVsIterator.display(cs.iterator());
	}
}
