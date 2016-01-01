package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/1.
 */
class Base{
	Base(){
		print("Base constructor");
	}
}
class Derive extends Base{
	Derive(){
		print("Derive constructor");
	}
}
public class Exercise4 extends Derive{
	Exercise4(){
		print("Exercise4 constructor");
	}
	public static void main(String[] args){
		Exercise4 x=new Exercise4();
	}
}
