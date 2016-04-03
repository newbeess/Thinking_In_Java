package com.elephant.generics;
import java.util.*;
/**
 * Created by elephant on 16/4/3.
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args){
		Class c1=new ArrayList<String>().getClass();
		Class c2=new ArrayList<Integer>().getClass();
		System.out.println(c1==c2);
	}
}
