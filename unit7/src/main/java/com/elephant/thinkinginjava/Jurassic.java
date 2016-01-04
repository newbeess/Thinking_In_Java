package com.elephant.thinkinginjava;

/**
 * Making an entire final class
 */
class SmallBrain{}

final class Dinosaur{
	int i=7;
	final int j=1;
	SmallBrain x=new SmallBrain();
	void f(){}
}
//error: Cannot extend final class
//! class Further extends Dinosaur{}

/**
 * In fianl class:
 * 				  data can be final or not ;
 * 				  method can't be inherited
 */
public class Jurassic {
	public static void main(String[] args){
		Dinosaur x =new Dinosaur();
		x.f();
		x.i=1;
	//	x.j++;
	}
}
