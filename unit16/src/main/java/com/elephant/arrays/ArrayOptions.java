package com.elephant.arrays;
import java.util.*;
import static com.elephant.util.Print.*;
/**
 * Initialization & re-assignment of arrays
 *
 * array name just a reference
 */
public class ArrayOptions {
	public static void main(String[] args){
// 1. default , array is null
		BerylliumSphere[] a;	// Local uninitialized variable
		BerylliumSphere[] b=new BerylliumSphere[5];
		print("b: "+Arrays.toString(b));
// 2. loop initialization
		BerylliumSphere[] c=new BerylliumSphere[4];
		for (int i=0;i<c.length;i++)
			if (c[i]==null)
				c[i]=new BerylliumSphere();
// 3. aggregate initilization
		BerylliumSphere[] d={new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
// 4. dynamic aggregate initialization
		a=new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};

		print("a.length = "+a.length);
		print("b.length = "+b.length);
		print("c.length = "+c.length);
		print("d.length = "+d.length);
// re-assign
		a=d;
		print("a.length = "+a.length);
// Arrays of primitives
		int[] e;
		int[] f=new int[5];
		print("f: "+Arrays.toString(f));// automatically initialize to zeros

		int[] g=new int[4];
		for (int i=0;i<g.length;i++)
			g[i]=i*i;

		int[] h={11,47,93};
// not initialize
		//print("e.length = "+e.length);
		print("f.length = "+f.length);
		print("g.length = "+g.length);
		print("h.length = "+h.length);
// re-assign
		e=h;
		print("e.length = "+e.length);
// re-assign
		e=new int[]{1,2};
		print("e.length = "+e.length);
	}
}
