package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * override the method from superclass also with final
 */
class FinalMethod{
	final void f(){print("FinalMethod.f()");}
}
public class Exercise21 extends FinalMethod{
//	@Override
//	void f(){print("Exercise21.f()");}
	public static void main(String[] args){
		new Exercise21().f();
	}
}
