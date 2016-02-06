package com.elephant.innerclasses.innerclasses;

/**
 * Created by elephant on 16/2/4.
 */
public class Parcel7b {
	class MyContents implements Contents{
		private int i=11;
		public int value() {
			return i;
		}
	}
	public Contents contents(){return new MyContents();}
	public static void main(String[] args){
		Parcel7b x=new Parcel7b();
		x.contents();
	}
}
