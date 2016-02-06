package com.elephant.innerclasses.exercises;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/2/3.
 */
interface WithOneMethod{
	void f();
}
public class Exercise9 {
	public WithOneMethod implementInterface(){
		class Complement implements WithOneMethod{
			public void f() {
				print("Complement.f().");
			}
		}
		Complement complement=new Complement();
		complement.f();
		return complement;
	}
	public static void main(String[] args){
		Exercise9 x=new Exercise9();
		x.implementInterface();
	}
}
