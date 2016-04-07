package com.elephant.arrays;
import java.util.*;
import com.elephant.util.*;
import static com.elephant.util.Print.*;
/**
 * Implementing a Comparator for a class
 */
class CompTypeComparator implements Comparator<CompType>{
	public int compare(CompType o1,CompType o2){
		return (o1.j<o2.j ? -1 : (o1.j==o2.j ? 0 : 1));
	}
}

public class ComparatorTest {
	public static void main(String[] args){
		CompType[] a={
				new CompType(58,55),new CompType(93,61),new CompType(61,29),
				new CompType(68,0),new CompType(22,7),new CompType(48,12),
				new CompType(1,88),new CompType(41,80),new CompType(11,90)
		};
		print("before sorting: ");
		print(Arrays.toString(a));
		Arrays.sort(a,new CompTypeComparator());
		print("After sorting: ");
		print(Arrays.toString(a));
	}
}
