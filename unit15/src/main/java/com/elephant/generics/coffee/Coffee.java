package com.elephant.generics.coffee;

/**
 * Created by elephant on 16/3/15.
 */
public class Coffee {
	private static long counter=0;
	private final long id=counter++;
	public String toString(){
		return getClass().getSimpleName()+" "+id;
	}
}
