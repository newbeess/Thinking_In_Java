package com.elephant.arrays;
import java.util.*;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/4/5.
 */
class BerylliumSphere{
	private static long counter;
	private final long id=counter++;
	public String toString(){return "Sphere "+id;}
}

public class ContainerComparison {
	public static void main(String[] args){
		BerylliumSphere[] spheres=new BerylliumSphere[10];
		for (int i=0;i<5;i++)
			spheres[i]=new BerylliumSphere();
		print(Arrays.toString(spheres));
		print(spheres[4]);

		List<BerylliumSphere> sphereList=new ArrayList<BerylliumSphere>();
		for (int i=0;i<5;i++)
			sphereList.add(new BerylliumSphere());
		print(sphereList);
		print(sphereList.get(4));

		int[] integers={0,1,2,3,4,5};
		print(Arrays.toString(integers));
		print(integers[4]);

		List<Integer> integerList=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		integerList.add(97);
		print(integerList);
		print(integerList.get(4));

	}
}
