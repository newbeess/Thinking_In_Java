package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import typeinfo.pets.*;
import java.util.*;

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it){
		while (it.hasNext()){
			Pet p=it.next();
			printnb(p.id() + ":" + p + " ");
		}
		print();
	}

	public static void display(Collection<Pet> pets){
		for (Pet p : pets)
			printnb(p.id() + ":" + p + " ");
		print();
	}

	public static void main(String[] args){
		List<Pet> petList=Pets.arrayList(8);
		Set<Pet> petSet=new HashSet<Pet>(petList);
		Map<String,Pet> petMap=new LinkedHashMap<String, Pet>();
		String[] names=("Ralph, Eric, Robin, Lacey, "+"Britney, Sam, Spot, Fluffy").split(", ");
		for (int i=0;i<names.length;i++)
			petMap.put(names[i],petList.get(i));

		display(petList);
		display(petSet);

		display(petList.iterator());
		display(petSet.iterator());

		print(petMap);
		print(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}
}
