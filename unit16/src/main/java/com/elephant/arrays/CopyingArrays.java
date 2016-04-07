package com.elephant.arrays;

import java.util.*;
import static com.elephant.util.Print.*;
/**
 * Using System.arraycopy()
 */
public class CopyingArrays {
	public static void main(String[] args){
// fill
		int[] i=new int[7];
		int[] j=new int[10];
		Arrays.fill(i,47);
		Arrays.fill(j,99);
		print("i = "+Arrays.toString(i));
		print("j = "+Arrays.toString(j));
// arraycopy
		System.arraycopy(i,0,j,0,i.length);
		print("j = "+Arrays.toString(j));
// arraycopy
		int[] k=new int[5];
		Arrays.fill(k,103);
		System.arraycopy(i,0,k,0,k.length);
		print("k = "+Arrays.toString(k));
// arraycopy
		Arrays.fill(k,103);
		System.arraycopy(k,0,i,0,k.length);
		print("i = "+Arrays.toString(i));
// Object
		Integer[] u=new Integer[10];
		Integer[] v=new Integer[5];
		Arrays.fill(u,new Integer(47));
		Arrays.fill(v,new Integer(99));
		print("u = "+Arrays.toString(u));
		print("v = "+Arrays.toString(v));
// Object arraycopy
		System.arraycopy(v,0,u,u.length/2,v.length);
		print("u = "+Arrays.toString(u));
	}
}
