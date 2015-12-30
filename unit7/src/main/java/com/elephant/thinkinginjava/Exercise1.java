package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/30.
 */
import static com.elephant.util.Print.*;

class Simple{
	private String s;
	Simple(){
		s="lazy initialization";
		print("Simple Constructor.");
	}
	public String toString(){return s;}
}
public class Exercise1 {
	private int i;
	private static int ps;
	Simple sm;
	Exercise1(){
		ps=2;
		print("Exercise1 Constructor.");
	}
	public String toString(){
		if(sm==null)
			sm=new Simple();
		return "i= "+i+"\n"+
				"ps= "+ps+"\n"+
				"sm="+sm+"\n";
	}
	public static void main(String[] args){
		Exercise1 exercise1=new Exercise1();
		print(exercise1);
	}
}
