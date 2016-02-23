package com.elephant.thinkinginjava.holding;
import java.util.*;
import typeinfo.pets.*;
import static com.elephant.util.Print.*;

public class LinkedListFeatures {
	public static void main(String[] args){
		LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
		print(pets);

		// Identical:
		print("pets.getFirst(): "+pets.getFirst());
		print("pets.element(): "+pets.element());

		// Only differs in empty-list behavior:
		print("pets.peek(): "+pets.peek());

		// Identical; remove and return the first element:
		print("pets.remove(): "+pets.remove());
		print("pets.removeFirst(): "+pets.removeFirst());

		// Only differs in empty-list behavior:
		print("pets.poll(): "+pets.poll());
		print(pets);

		// addFirst()
		pets.addFirst(new Rat());
		print("After addFirst(): "+pets);

		// offer()
		pets.offer(Pets.randomPet());
		print("After randomPet(): "+pets);


		// add()
		pets.add(Pets.randomPet());
		print("After add(): "+ pets);

		// addLast()
		pets.addLast(new Hamster());
		print("After addLast(): "+pets);

		// removeLast()
		print("pets.removeLast(): "+pets.removeLast());
	}
}
