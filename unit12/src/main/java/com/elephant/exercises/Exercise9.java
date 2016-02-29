package com.elephant.exercises;

class Base extends Exception{}
class Exception1 extends Base{}
class Exception2 extends Base{}
class Exception3 extends Base{}

public class Exercise9 {
	static void f()throws Exception1,Exception2,Exception3{
		throw new Exception1();
		//throw new Exception2();
		//throw new Exception3();
	}
	public static void main(String[] args){
		try {
			f();
		} catch (Base e){
			System.out.println(e);
		} catch (Exception e){
			System.out.println(e);
		}
	}
}
