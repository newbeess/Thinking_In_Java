package com.elephant.thinkinginjava.holding;
import typeinfo.pets.*;
import java.util.*;

class PetSequence{
	protected Pet[] pets=Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence{
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
		NonCollectionSequence nsc=new NonCollectionSequence();
		InterfaceVsIterator.display(nsc.iterator());
	}

}

