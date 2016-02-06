package com.elephant.innerclasses.exercises;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/2/3.
 */
public class Exercise8 {
	class Inner{
		private int i=0;
	}
	public void accessInner(){
		Inner x=new Inner();
		print(x.i);
		x.i++;
		print(x.i);
	}
	public static void main(String[] args){
		Exercise8 x=new Exercise8();
		x.accessInner();
	}
}
