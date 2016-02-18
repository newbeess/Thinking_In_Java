package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import typeinfo.pets.*;
import java.util.*;

public class SimpleIteration {
	public static void main(String[] args){
		List<Pet> pets=Pets.arrayList(12);
		Iterator<Pet> it=pets.iterator();

		//Use while to traverse List
		while (it.hasNext()){
			Pet p=it.next();
			print(p.id()+":"+p+" ");
		}
		print();

		//A simpler approach,when possible:
		for (Pet p:pets)
			print(p.id()+":"+p+" ");
		print();

		//An iterator can also remove elements:
		it=pets.iterator();
		for (int i=0;i<6;i++){
			it.next();
			it.remove();
		}
		print(pets);
	}
}
