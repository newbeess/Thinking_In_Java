package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
import typeinfo.pets.*;

public class CrossContainerIteration {
	public static void disPlay(Iterator<Pet> it){
		while (it.hasNext()){
			Pet p=it.next();
			print(p.id()+":"+p+" ");
		}
		print();
	}

	public static void main(String[] args){
		ArrayList<Pet> pets=Pets.arrayList(8);
		LinkedList<Pet> petsll=new LinkedList<Pet>(pets);

		HashSet<Pet> petsHS=new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);

		disPlay(pets.iterator());
		disPlay(petsll.iterator());
		disPlay(petsHS.iterator());
		disPlay(petsTS.iterator());
	}
}
