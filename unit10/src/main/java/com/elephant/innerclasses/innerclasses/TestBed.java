package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 *	Putting test code in a nested class.
 *	(main:TestBed$Tester)
 */

public class TestBed {
	public void f(){print("TestBed.f()");}
	public static class Tester{
		public static void main(String[] args){
			TestBed t=new TestBed();
			t.f();
		}
	}
}
