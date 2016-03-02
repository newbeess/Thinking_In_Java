package com.elephant.strings;
import java.util.*;
/**
 * Accidental recursion.
 * (Run by Hand)
 */

public class InfinitetRecursion {
	public String toString(){
		return " InfiniteRecursion address: "+this+"\n";
	}
	public static void main(String[] args){
		List<InfinitetRecursion> list=new ArrayList<InfinitetRecursion>();
		for (int i=0;i<10;i++)
			list.add(new InfinitetRecursion());
		System.out.println(list);
	}
}
