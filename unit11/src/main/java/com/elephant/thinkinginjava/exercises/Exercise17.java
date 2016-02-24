package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;

/**
 *  Use Gerbil in Exercise1.java and put it in Map.
 *  Associate each Gerbil(the value) with its name as a String(the key).
 *  Use an Iterator fot keySet() to move through the Map,look up the Gerbil for each key, print out the key and tell it to hop.
 */

public class Exercise17 {
	public static void main(String[] args){
		Map<String,GerBil> map=new HashMap<String, GerBil>();
		map.put("Fuzzy",new GerBil(1));
		map.put("Spot",new GerBil(2));
		map.put("Joe",new GerBil(3));
		map.put("Cart",new GerBil(4));

		// iterate by keySet()
		Iterator<String> iterator=map.keySet().iterator();
		while (iterator.hasNext()){
			String key=iterator.next();
			printnb(key);
			map.get(key).hop();
		}

		// iterator by value()
		Iterator<GerBil> iterator1=map.values().iterator();
		while (iterator1.hasNext()){
			GerBil value=iterator1.next();
		}

		// iterate by both key and values
		Iterator<Map.Entry<String,GerBil>> it=map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<String,GerBil> entry=it.next();
			printnb(entry.getKey()+": ");
			entry.getValue().hop();
		}
	}
}
