package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Modify ListFeatures
 * Use String instead of Pet
 */
public class Exercise6 {
	static Random rand=new Random(47);
	public static void main(String[] args){
		List<String> strs=new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
		print("1: "+strs);

		//add(),contains()
		strs.add("H");
		print("2: " + strs);
		print("3: "+strs.contains("H"));

		//remove(),get(),indexOf()
		strs.remove("H");
		String s1=strs.get(2);
		print("4: "+s1+" "+strs.indexOf(s1));

		//indexOf(),remove()
		String s2="A";
		print("5: "+strs.indexOf(s2));
		print("6: "+strs.remove(s2));
		print("7: "+strs.remove(s1));
		print("8: "+strs);

		//add()
		strs.add(3,"0");
		print("9: "+strs);

		//subList(),containsAll()
		List<String> sub=strs.subList(1,4);
		print("subList: "+sub);
		print("10: "+strs.containsAll(sub));

		//sort()
		Collections.sort(sub);
		print("sorted subList: "+sub);
		print("11: "+strs.containsAll(sub));

		//shuffle()
		Collections.shuffle(sub,rand);
		print("shuffled subList: "+sub);
		print("12: "+strs.containsAll(sub));

		//COPY
		List<String> copy=new ArrayList<String>(strs);

		//Arrays.asList(),get()
		sub=Arrays.asList(strs.get(1),strs.get(4));
		print("sub: "+sub);

		//retainAll()
		copy.retainAll(sub);
		print("13: " + copy);

		//remove()
		copy=new ArrayList<String>(strs);
		copy.remove(2);
		print("14: "+copy);

		//removeAll()
		copy.removeAll(sub);
		print("15: "+copy);

		//set()
		copy.set(1,"1");
		print("16: "+copy);

		//addAll(),clear()
		copy.addAll(2,sub);
		print("17: "+copy);
		print("18: "+strs.isEmpty());
		strs.clear();
		print("19: "+strs);
		print("20: "+strs.isEmpty());

		//toArray()
		strs.addAll(Arrays.asList("A","B","C","D"));
		print("21: "+strs);
		Object[] o=strs.toArray();
		print("22: "+o[3]);
		String[] sa=strs.toArray(new String[0]);
		print("22: "+sa[3]);
	}
}
