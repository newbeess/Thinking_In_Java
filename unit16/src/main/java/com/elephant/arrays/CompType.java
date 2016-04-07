package com.elephant.arrays;
import java.util.*;
import com.elephant.util.*;
import static com.elephant.util.Print.*;

/**
 * Implmenting Comparable in a class
 */

public class CompType implements Comparable<CompType> {
	int i;
	int j;
	private static int count=1;
	public CompType(int n1,int n2){i=n1;j=n2;}
	public String toString(){
		String result="[i ="+i+", j= "+j+"]";
		if (count++ %3 ==0)
			result +="\n";
		return result;
	}
	public int compareTo(CompType rv) {
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}
	private static Random rand=new Random(47);
	public static Generator<CompType> generator(){
		return new Generator<CompType>(){
			public CompType next(){
				return new CompType(rand.nextInt(100), rand.nextInt(100));
			}
		};
	}

	public static void main(String[] args){
		CompType[] a= {
				new CompType(58,55),new CompType(93,61),new CompType(61,29),
				new CompType(68,0),new CompType(22,7),new CompType(48,12),
				new CompType(1,88),new CompType(41,80),new CompType(11,90)
		};
		print("before sorting: ");
		print(Arrays.toString(a));
		Arrays.sort(a);
		print("After sorting: ");
		print(Arrays.toString(a));
	}
}
