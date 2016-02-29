package com.elephant.exercises;

class Thrower{
	public void f(){
	//	throw new MyException("Inside f()");
	}
	public void g() throws MyException{
		throw new MyException("Inside g()");
	}
}
public class Exercise8 {
	public static void main(String[] args){
		Thrower x=new Thrower();
		try {
			x.g();
		} catch (MyException e){
			System.out.println(e.getMessage());
		}
	}
}
