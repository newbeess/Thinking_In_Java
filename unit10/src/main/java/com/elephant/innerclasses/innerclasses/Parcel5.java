package com.elephant.innerclasses.innerclasses;

/**
 * Nesting a class within a method
 */

public class Parcel5 {
	public Destination destination(String s){
		class pDestination implements Destination{
			private String label;
			private pDestination(String whereTo){
				label=whereTo;
			}
			public String readLabel() {
				return label;
			}
		}
		return new pDestination(s);
	}
	public static void main(String[] args){
		Parcel5 x=new Parcel5();
		Destination d=x.destination("elephant");
	}
}
