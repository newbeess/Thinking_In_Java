package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Inherit from beetle
 */
class JPBeetle extends Beetle{
	int m =printInit("JPBeetle.m initialization");
	JPBeetle(){
		print("m="+m);
		print("j="+j);
	}
	static int x3=printInit("static JPBeetle.x3 initialization");
}
public class Exercise24 {
	public static void main(String[] args){
		print("start loading:");
		new JPBeetle();
	}
}
