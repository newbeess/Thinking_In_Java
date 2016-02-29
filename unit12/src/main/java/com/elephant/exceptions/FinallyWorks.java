package com.elephant.exceptions;

/**
 * The finally clause is always excuted.
 */
class ThreeException extends Exception{}

public class FinallyWorks {
	static int count=0;
	public static void main(String[] args){
		while (true){
			try {
				if (count++ == 0)
					throw new ThreeException();
				System.out.println("No exception");
			} catch (ThreeException e){
				System.out.println("Threeexception");
			} finally {
				System.out.println("In finally clause");
				if (count == 2)
					break;
			}
		}
	}
}
