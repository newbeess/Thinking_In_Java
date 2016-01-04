package com.elephant.thinkinginjava;

import com.sun.org.apache.bcel.internal.generic.POP;

/**
 * Initialize must be do in
 * 	final defination positoin or constructor
 * 	not block,or before use
 */
class Poppet{
	private int i;
	Poppet(int i){i=i;}
}
public class BlankFinal {
	private final int i=0;		//Initialized final
	private final int j;		//Blank final
	private  final Poppet p;	//Blank final reference
	//Blank final must be initialized in the constructor
	public BlankFinal(){
		j=1; 					//Initialize blank final
		p=new Poppet(1); 		//Initialize blank final reference
	}
	public BlankFinal(int x){
		j=x;
		p=new Poppet(x);
	}
	public static void main(String[] args){
		new BlankFinal();
		new BlankFinal(1);
	}
}
