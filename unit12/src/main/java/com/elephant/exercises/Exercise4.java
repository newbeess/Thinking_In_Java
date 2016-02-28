package com.elephant.exercises;

class MyException extends Exception{
	String s;
	MyException(String msg){super(msg);s=msg;}
}
public class Exercise4 {
	public static void main(String[] args){
		try {
			throw new MyException("i am  an MyException.");
		} catch (MyException e){
			System.out.println("e.getMessage()= "+e.getMessage()+"\n"+"e.s= "+e.s+"\n"+"e= "+e);
		}
	}
}
