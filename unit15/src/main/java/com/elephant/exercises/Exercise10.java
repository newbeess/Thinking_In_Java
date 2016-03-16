package com.elephant.exercises;

class GenerciMethod2{
	public <A,B> void f(A a,B b,Boolean c){
		System.out.println(a.getClass().getSimpleName());
		System.out.println(b.getClass().getSimpleName());
		System.out.println(c.getClass().getSimpleName());

	}
}

public class Exercise10 {
	public static void main(String[] args){
		GenerciMethod2 x=new GenerciMethod2();
		x.f(1f,"",false);

	}
}
