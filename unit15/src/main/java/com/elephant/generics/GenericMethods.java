package com.elephant.generics;

public class GenericMethods {
	// 泛型方法
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args){
		GenericMethods x=new GenericMethods();
		x.f("");
		x.f(1);
		x.f(1f);
		x.f(x);
	}
}
