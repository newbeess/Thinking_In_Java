package com.elephant.exercises;
import java.util.*;
import com.elephant.util.*;

public class Exercise11 {
	public static void main(String[] args){
		List<SixTuple<Byte,Short,String,Float,Double,Integer>> list=New.list();
		list.add(new SixTuple<Byte, Short, String, Float, Double, Integer>((byte)1,(short)1,"A",1.0F,1.9,1));
		System.out.println(list);

	}
}
