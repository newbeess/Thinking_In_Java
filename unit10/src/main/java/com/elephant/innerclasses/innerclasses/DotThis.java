package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 *	Qualifying access to the outer-class object.
 */

public class DotThis {
	void f(){print("DotThis.f()");}
	//	Inner class
	public class Inner{
		public DotThis outer(){
			return  DotThis.this;
		}
	}
	public Inner inner(){return new Inner();}
	public static void main(String[] args){
		DotThis dt=new DotThis();
		DotThis.Inner dti=dt.inner();
		dti.outer().f();
	}
}
