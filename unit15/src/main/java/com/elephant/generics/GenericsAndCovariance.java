package com.elephant.generics;
import java.util.*;
/**
 * Created by elephant on 16/4/4.
 */
public class GenericsAndCovariance {
	public static void main(String[] args){
		// Wildcards allow covariance
		List<? extends Fruit> flist=new ArrayList<Apple>();
		//flist.add(new Orange());
		//flist.add(new Fruit());
		//flist.add(new Apple());
		flist.add(null);
		System.out.println(flist.get(0));
	}
}
