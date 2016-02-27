package com.elephant.exercises;


public class Exercise3 {
	public static void main(String[] args){
		int[] array={1,2,3};
		try {
				System.out.println(array[9]);
		} catch (Exception e){
			System.out.println("Caught an exception: "+e);
		}
	}
}
