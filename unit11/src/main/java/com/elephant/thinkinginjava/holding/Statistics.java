package com.elephant.thinkinginjava.holding;
import java.util.*;
/**
 * Sample demonstration of HashMap
 */

public class Statistics {
	public static void main(String[] args){
		Random random=new Random(47);
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		System.out.println(map);
		for (int i=0;i<10000;i++){
			// Produce a number between 0 and 20
			int r=random.nextInt(20);
			Integer freq= map.get(r);
			map.put(r,freq==null? 1: freq+1);
			if (i==1)
				System.out.println(map);
			if (i==2)
				System.out.println(map);
		}
		System.out.println(map);
	}
}
