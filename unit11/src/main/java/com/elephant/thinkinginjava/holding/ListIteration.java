package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import typeinfo.pets.*;
import java.util.*;
/**
 * Created by elephant on 16/2/18.
 */
public class ListIteration {
	public static void main(String[] args){
		List<Pet> pets =Pets.arrayList(8);
		ListIterator<Pet> it=pets.listIterator();
		while (it.hasNext())
			printnb(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+", ");
		print();

		//Backwards
		while (it.hasPrevious())
			printnb(it.previous().id()+" ");
		print();
		print(pets);
		while (it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		print(pets);
	}
}
