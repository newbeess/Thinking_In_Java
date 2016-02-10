package com.elephant.innerclasses.innerclasses;
/**
 *	Inheriting an inner class
 */

class WithInner{
	class Inner{Inner(){}}
}
public class InheritInner extends WithInner.Inner{
	//!	Inheritinner(){}
	InheritInner(WithInner wi){wi.super();}
	public static void main(String[] args){
		WithInner wi=new WithInner();
		InheritInner Ii=new InheritInner(wi);
	}
}
