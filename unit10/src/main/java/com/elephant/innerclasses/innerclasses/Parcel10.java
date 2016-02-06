package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 * 	Using "instance initialization" to perform construction on an anonynous inner class
 */
public class Parcel10 {
	public Destination destination(final String dest,final float price){
		return new Destination() {
			private int cost;
			{
				cost=Math.round(price);
				if (cost>100)
					print("Over Budget");
			}
			private String label=dest;
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args){
		Parcel10 p=new Parcel10();
		Destination d=p.destination("elephant",101.11F);
	}
}
