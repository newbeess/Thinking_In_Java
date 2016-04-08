package com.elephant.containers;
import java.util.*;
/**
 * The Collectinos.fill() & Collections.nCopies() methods
 */
class StringAddress{
	private String s;
	public StringAddress(String s){this.s=s;}
	public String toString(){
		return super.toString()+" "+s;
	}
}

public class FillingLists {
	public static void main(String[] args){
// nCopies() return n copies of specify object
		List<StringAddress> list=new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list,new StringAddress("World!"));
		System.out.println(list);
	}
}
