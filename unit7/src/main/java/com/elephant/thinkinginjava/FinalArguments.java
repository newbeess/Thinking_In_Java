package com.elephant.thinkinginjava;

/**
 * Using final with method arguments.
 */
class Gizmo{
	public void spin(){}
}
public class FinalArguments {
	void with(final Gizmo g){
	//	g=new Gizmo(); //final can not change
	}
	void without(Gizmo g){
		g=new Gizmo();
		g.spin();
	}
	void f(final int i){
	//	i++;		//final can not change
	}
	int g(final int i){
		return i+1;
	}
	public static void main(String[] args){
		FinalArguments x=new FinalArguments();
		x.without(null);
		x.with(null);
	}
}
