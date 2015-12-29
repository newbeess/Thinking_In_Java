package com.elephant.thinkinginjava;

/**
 * Demonstrate class access specifiers.
 * Make a class effectively private with private constructor.
 */
class Soup1{
	//Allow creation via static method.
	private Soup1(){
	}
	public static Soup1 makeSoup(){
		return new Soup1();
	}
}
class Soup2{
	//Create a static object and return a reference upon request
	private static  Soup2 ps1=new Soup2();
	public static Soup2 access(){
		return ps1;
	}
	public void f(){

	}
}

public class Lunch {
	void testPrivate(){
		//Soup1 sp1=new Soup1();
	}
	void testStatic(){
		Soup1 sp1=Soup1.makeSoup();
	}
	void testSingleton(){
		Soup2 sp1=Soup2.access();
		Soup2 sp2=Soup2.access();
	}
	public static void main(String[] args){
		Lunch lc=new Lunch();
		lc.testPrivate();
		lc.testStatic();
		lc.testSingleton();
	}
}
