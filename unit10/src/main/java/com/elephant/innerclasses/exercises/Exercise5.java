package com.elephant.innerclasses.exercises;


class OuterIncludeInner{
	class Inner{}
}

public class Exercise5 {
	public static void main(String[] args){
		OuterIncludeInner o=new OuterIncludeInner();
		OuterIncludeInner.Inner i=o.new Inner();
	}
}
