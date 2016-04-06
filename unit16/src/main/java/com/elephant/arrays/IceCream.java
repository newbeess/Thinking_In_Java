package com.elephant.arrays;
import java.util.*;
/**
 * Returning arrays from method
 */
public class IceCream {
	private static Random rand=new Random(47);
	static final String[] FLAVORS={
			"Chocllate","Strawberry","Vanilla Fudge Swirl",
			"Mint Chip","Mocha Almod Fudge","Rum Raisin",
			"Praline Cream","Mud Pie"
	};
// return String array[n]
	public static String[] flavorSet(int n){
		if (n>FLAVORS.length)
			throw new IllegalArgumentException("Set too big");
		String[] results=new String[n];
		boolean[] picked=new boolean[FLAVORS.length];
		for (int i=0;i<n;i++){
			int t;
			do
				t=rand.nextInt(FLAVORS.length);
			while (picked[t]);
			results[i]=FLAVORS[t];
			picked[t]=true;
		}
		return results;
	}

	public static void main(String[] args){
		for (int i=0;i<7;i++)
			System.out.println(Arrays.toString(flavorSet(3)));
	}

}
