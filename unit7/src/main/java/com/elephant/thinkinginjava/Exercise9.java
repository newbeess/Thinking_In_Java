package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/1.
 */
class Component1{
	Component1(){
		print("Component1 constructor");
	}
}
class Component2{
	Component2(){
		print("Component2 constructor");
	}
}
class Component3{
	Component3(){
		print("Component3 constructor");
	}
}

class Root{
	static {
		print("Root static block");
	}
	Root(){
		print("Root constructor");
	}
	Component1 c1=new Component1();
	Component2 c2=new Component2();
	Component3 c3=new Component3();
}
class  Stem extends Root{
	static{
		print("Stem static block");
	}
	Component1 c4=new Component1();
	Component2 c5=new Component2();
	Component3 c6=new Component3();
	Stem(){
		print("Stem constructor");
	}
}
public class Exercise9 {
	public static void main(String[] args){
		new Stem();
	}
}
