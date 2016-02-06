package com.elephant.innerclasses.exercises;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/2/3.
 */

public class Exercise11 {
	private class PrivateInner implements WithOneMethod{
		public void f() {
			print("PrivateInner.f()");
		}
	}
	WithOneMethod getPrivate(){return new PrivateInner();}
	void f(){WithOneMethod x=new PrivateInner();}
	public static void main(String[] args){
		Exercise11 x=new Exercise11();
		WithOneMethod withOneMethod=x.getPrivate();
		withOneMethod.f();
	}
}
