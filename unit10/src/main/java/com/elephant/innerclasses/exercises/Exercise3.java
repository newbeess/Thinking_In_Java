package com.elephant.innerclasses.exercises;
import static com.elephant.util.Print.*;
/**
 *
 */
class Outer1{
	private String s;
	Outer1(String s){this.s=s;}
	//	Inner class
	class Inner{
		public String toString() {
			return s;
		}
	}
	public Inner returnInner(){return new Inner();}
}

public class Exercise3 {
	public static void main(String[] args){
		Outer1 outer1=new Outer1("From Outer.Inner.toString().");
		Outer1.Inner inner=outer1.returnInner();
		print(inner);
	}
}
