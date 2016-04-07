package com.elephant.arrays;
import java.util.*;
import com.elephant.util.*;
import static com.elephant.util.Print.*;
/**
 * Using Arrays.binarySearch()
 */
public class ArraySearching {
	public static void main(String[] args){
		int[] a={13,1,545,5856,12,23,41,14,51,15,16,22,100,92,28,145,211};
		Arrays.sort(a);
		print("Sorted array: "+Arrays.toString(a));
		print("Location of 12 is : "+Arrays.binarySearch(a,12));
	}
}
