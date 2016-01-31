package com.elephant.innerclasses.exercises;

/**
 *
 */
class Outer{
	class Inner{}
	public Inner returnInner(){return new Inner();}
}

public class Exercise1 {
	public static void main(String[] args){
		//Outer.Inner i=new Outer.Inner();
		Outer o=new Outer();
		Outer.Inner i=o.returnInner();
	}
}
