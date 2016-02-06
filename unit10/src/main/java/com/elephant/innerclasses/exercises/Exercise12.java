package com.elephant.innerclasses.exercises;

import static com.elephant.util.Print.print;

/**
 * Created by elephant on 16/2/4.
 */
public class Exercise12 {
	private int i=0;
	private void f(){print("Exercise12.f()");}
	public Exercise12 ChangeOuter(){
		return new Exercise12(){

		};
	}
}
 class Exercise7 {
	private int i=0;
	private void f(){print("Exercise7.f()");}
	//Inner class
	class Inner{
		private void changeOuter(){
			i++;
			f();
		}
	}
	//Change outer private field.
	public void innerChangeOuter(){
		Inner x=new Inner();
		print("i="+i);
		x.changeOuter();
		print("i="+i);
	}
	//main
	public static void main(String[] args){
		Exercise7 x=new Exercise7();
		x.innerChangeOuter();
	}
}