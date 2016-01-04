package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 *	Blank final reference,after initialization,it can't change.
 */
class WithBlankFinalField {
	private final Integer i;

	public WithBlankFinalField(int ii) {
		i = new Integer(ii);
	//	i = new Integer(11);  //Can't change
	}
	public Integer getI() {
		//if(i==null)
		//	i=new Integer(1); //final only can be initialized in constructor or defeniation position
		return i;
	}
}
public class Exercise19 {
	public static void main(String[] args){
		WithBlankFinalField x=new WithBlankFinalField(10);
		print(x.getI());
	}
}
