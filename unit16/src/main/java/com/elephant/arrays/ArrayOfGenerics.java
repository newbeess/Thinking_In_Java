package com.elephant.arrays;
import java.util.*;
/**
 * It is possible to create arrays of generics.
 */

public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
//
		List<String>[] ls;
		List[] la=new List[10];
		// cast
		ls=(List<String>[])la;

		ls[0]=new ArrayList<String>();

		// compile-time checking produces an error
		//ls[1]=new ArrayList<Integer>();
//
		Object[] objects=ls;
		objects[1]=new ArrayList<Integer>();
//
		List<BerylliumSphere>[] spheres=(List<BerylliumSphere[]>) new List[10];
		for (int i=0;i<spheres.length;i++)
			spheres[i]=new ArrayList<BerylliumSphere>();
	}
}
