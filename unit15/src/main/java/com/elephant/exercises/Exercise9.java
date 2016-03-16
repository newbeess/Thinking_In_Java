package com.elephant.exercises;

class GenerciMethod1{
	public <A,B,C> void f(A a,B b,C c){
		System.out.println(a.getClass().getSimpleName());
		System.out.println(b.getClass().getSimpleName());
		System.out.println(c.getClass().getSimpleName());

	}
}

public class Exercise9 {
	public static void main(String[] args){
		GenerciMethod1 x=new GenerciMethod1();
		x.f(1,2f,x);
	}
}
