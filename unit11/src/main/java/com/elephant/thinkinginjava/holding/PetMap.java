package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import typeinfo.pets.*;
import java.util.*;

public class PetMap {
	public static void main(String[] args){
		Map<String,Pet> petMap=new HashMap<String, Pet>();
		petMap.put("My Cat",new Cat("Miao,Maio"));
		petMap.put("My Dog",new Dog("Wang,Wang"));
		petMap.put("My Hamster",new Hamster("Wu,Wu"));
		print(petMap);
		Pet dog=petMap.get("My Dog");
		print(dog);
		print(petMap.containsKey("My Cat"));
		print(petMap.containsValue(dog));
	}
}
