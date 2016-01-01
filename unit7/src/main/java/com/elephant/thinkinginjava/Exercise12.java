package com.elephant.thinkinginjava;

import static com.elephant.util.Print.*;

/**
 * Add dispose to Exercise9
 */
class Component111{
	Component111(){
		print("Component111 constructor");
	}
	void dispose(){
		print("Component111.dispose()");
	}
}
class Component222{
	Component222(){
		print("Component222 constructor");
	}
	void dispose(){
		print("Component222.dispose()");
	}
}
class Component333{
	Component333(){
		print("Component333 constructor");
	}
	void dispose(){
		print("Component333.dispose()");
	}
}

class Root11{
	static {
		print("Root11 static block");
	}
	Root11(){
		print("Root11 constructor");
	}
	Component111 c1=new Component111();
	Component222 c2=new Component222();
	Component333 c3=new Component333();
	void dispose(){
		print("Root11.dispose()");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}
class  Stem11 extends Root11{
	static{
		print("Stem11 static block");
	}
	Component111 c4=new Component111();
	Component222 c5=new Component222();
	Component333 c6=new Component333();
	Stem11(){
		print("Stem11 constructor");
	}
	void dispose(){
		c6.dispose();
		c5.dispose();
		c4.dispose();
		print("Stem11.dispose()");
		super.dispose();
	}
}
public class Exercise12 {
public static void main(String[] args){
	Stem11 x=new Stem11();
	try{
		//Code and exception handling...
	}
	finally {
		x.dispose();
	}

}
}
