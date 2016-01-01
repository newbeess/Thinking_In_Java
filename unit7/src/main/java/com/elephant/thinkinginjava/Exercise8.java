package com.elephant.thinkinginjava;

/**
 * Created by elephant on 16/1/1.
 */
class BaseClass{
	BaseClass(){}
}
class DeriveClass extends BaseClass{
	DeriveClass(){
		super();
	}
	DeriveClass(int i){
		super();
	}
}
public class Exercise8 {
	public static void main(String[] args){
		new DeriveClass();
		new DeriveClass(2);
	}
}
