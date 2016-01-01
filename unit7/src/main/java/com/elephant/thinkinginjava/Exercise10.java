package com.elephant.thinkinginjava;

import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/1/1.
 */
class Component11{
	Component11(int i){
		print("Component11 constructor"+i);
	}
}
class Component22{
	Component22(int i){
		print("Component22 constructor"+i);
	}
}
class Component33{
	Component33(int i){
		print("Component33 constructor"+i);
	}
}

class Root1{
	static {
		print("Root1 static block");
	}
	Root1(int i){
		print("Root1 constructor"+i);
	}
	Component11 c1=new Component11(1);
	Component22 c2=new Component22(2);
	Component33 c3=new Component33(3);
}
class  Stem1 extends Root1{
	static{
		print("Stem1 static block");
	}
	Component11 c4=new Component11(4);
	Component22 c5=new Component22(5);
	Component33 c6=new Component33(6);
	Stem1(int i){
		super(i);
		print("Stem1 constructor"+i);
	}
}
public class Exercise10 {
	public static void main(String[] args){
		new Stem1(1);
	}
}

