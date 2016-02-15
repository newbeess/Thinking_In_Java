package com.elephant.thinkinginjava.holding;
import java.util.*;
import static com.elephant.util.Print.*;
/**
 *	Containers print themselves automatically.
 */

public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill(Map<String,String> map){
		map.put("rat","Fuzzy");
		map.put("cat","Rags");
		map.put("dog","Bosco");
		map.put("dog","Spot");
		return map;
	}
	public static void main(String[] args){
		//Inherit from List
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		//Inherit from Set
		print(fill(new HashSet<String>()));
		print(fill(new TreeSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		//Inherit from Map
		print(fill(new HashMap<String, String>()));
		print(fill(new TreeMap<String, String>()));
		print(fill(new LinkedHashMap<String, String>()));
	}
}
