package com.elephant.exercises;

import java.util.*;

public class Exercise2 {
	public String toString(){
		return "Exercise"+super.toString()+"\n";
	}
	public static void main(String[] args){
		List<Exercise2> list=new ArrayList<Exercise2>();
		for (int i=0;i<10;i++)
			list.add(new Exercise2());
		System.out.println(list);
	}
}
