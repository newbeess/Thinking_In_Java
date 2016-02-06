package com.elephant.innerclasses.innerclasses;

/**
 * 	With concrete or abstract classes. inner classes are the only way to produce the effect of "multiple implementaiton inheritance"
 */
class D{}
abstract class E{}

class Z extends D{
	E makeE(){
		return new E() {};
	}
}

public class MultiImplementation {
	static void takeD(D d){}
	static void takeE(E e){}
	public static void main(String[] args){
		Z z=new Z();
		takeD(z);
		takeE(z.makeE());
	}
}
