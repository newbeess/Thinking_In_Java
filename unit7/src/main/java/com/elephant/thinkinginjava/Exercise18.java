package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * static final and final
 * Notice: static load only once,final just can not change
 */
class SelfCounter{
	private static int count;
	private int id=count++;
	public String toString(){
		return "SelfCounter "+id;
	}
}
class WithFinalFields{
	final SelfCounter scf=new SelfCounter();
	static final SelfCounter scsf=new SelfCounter();
	public String toString(){
		return "scf="+scf+"\nscsf="+scsf;
	}
}

public class Exercise18 {
	public static void main(String[] args){
		print("First Object:");
		print(new WithFinalFields());
		print("Second Objecs:");
		print(new WithFinalFields());
	}
}
