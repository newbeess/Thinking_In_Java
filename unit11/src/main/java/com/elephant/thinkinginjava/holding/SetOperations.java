package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;

public class SetOperations {
	public static void main(String[] args){
		Set<String> set1=new HashSet<String>();
		Collections.addAll(set1,
				"A B C D E F G H I J K L".split(" "));
		set1.add("M");

		// contains()
		print("H: "+set1.contains("H"));
		print("N: "+set1.contains("N"));

		Set<String> set2=new HashSet<String>();
		Collections.addAll(set2,
				"H I J K L ".split(" "));

		// containsAll()
		print("set2 in set1: "+set1.containsAll(set2));

		//remove() containsAll()
		set1.remove("H");
		print("set1: "+set1);
		print("set2 in set1: "+set1.containsAll(set2));

		// removeAll()
		set1.removeAll(set2);
		print("set2 removed from set1: "+set1);

		// addAll()
		Collections.addAll(set1,"X Y Z".split(" "));
		print("'X Y Z' added to set1: "+set1);
	}
}
