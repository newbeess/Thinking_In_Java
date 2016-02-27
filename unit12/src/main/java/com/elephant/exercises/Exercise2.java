package com.elephant.exercises;

class A{
	public void f(){}
}
public class Exercise2 {
	public static void main(String[] args){
		A a=null;
		try {
			a.f();
		} catch (Exception e){
			System.out.println("Caught an exception: "+e);
		}
	}
}
