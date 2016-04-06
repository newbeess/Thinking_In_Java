package com.elephant.arrays;
import java.util.*;
/**
 * Created by elephant on 16/4/6.
 */
public class MultidimensionalObjectArrays {
	public static void main(String[] args){
		BerylliumSphere[][] spheres={
				{new BerylliumSphere(),new BerylliumSphere()},
				{new BerylliumSphere(),new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()},
				{new BerylliumSphere(),new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere(),
				new BerylliumSphere(),new BerylliumSphere()},
		};
		System.out.println(Arrays.deepToString(spheres));
	}
}
