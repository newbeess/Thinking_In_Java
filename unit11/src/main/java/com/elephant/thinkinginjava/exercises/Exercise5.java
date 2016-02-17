package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Modify ListFeatures.java
 * Use Integer instead of Pet
 */

public class Exercise5 {
	static Random rand=new Random(47);
	public static void main(String[] args){
		List<Integer> ints=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		print("1: "+ints);

		ints.add(8);
		print("2: "+ints);
		print("3: "+ints.contains(8));

		ints.remove(Integer.valueOf(8));
		Integer i=ints.get(2);
		print("4: "+i+" "+ints.indexOf(i));

		Integer j=Integer.valueOf(1);
		print("5: "+ints.indexOf(j));
		print("6: "+ints.remove(j));
		print("7: "+ints.remove(i));
		print("8: "+ints);

		ints.add(3,0);
		print("9: "+ints);
		//ContainsAll()
		List<Integer> sub=ints.subList(1,4);
		print("sublist: "+sub);
		print("10: "+ints.containsAll(sub));

		//Collections.sort()
		Collections.sort(sub);
		print("sorted subList: "+sub);
		print("11: "+ints.containsAll(sub));

		//Collections.shuffle()
		Collections.shuffle(sub,rand);
		print("shuffled subList: "+sub);
		print("12: "+ints.containsAll(sub));

		List<Integer> copy=new ArrayList<Integer>(ints);
		sub=Arrays.asList(ints.get(1),ints.get(4));
		print("sub: "+sub);

		//retainAll()
		copy.retainAll(sub);
		print("13: "+copy);

		copy=new ArrayList<Integer>(ints);
		copy.remove(2);
		print("14: "+copy);

		copy.removeAll(sub);
		print("15: "+copy);

		//set()
		copy.set(1,9);
		print("16: "+copy);

		//addAll()
		copy.addAll(2,sub);
		print("17: "+copy);

		//clear
		print("18: "+ints.isEmpty());
		ints.clear();
		print("19: "+ints);
		print("20: "+ints.isEmpty());

		//addAll()
		ints.addAll(Arrays.asList(1,2,3,4));
		print("21: "+ints);

		//toArray()
		Object[] o=ints.toArray();
		print("22: "+o[3]);

		Integer[] ia=ints.toArray(new Integer[0]);
		print("22: "+ia[3]);

	}
}
