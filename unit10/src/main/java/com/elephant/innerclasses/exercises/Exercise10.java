package com.elephant.innerclasses.exercises;

import static com.elephant.util.Print.print;

/**
 * Created by elephant on 16/2/3.
 */
interface WithTwoMethod{
	void f();
	void g();
}
public class Exercise10 {
	public WithTwoMethod implementInterface(boolean b){
		if (b) {
			class Complement implements WithTwoMethod {
				public void f() {
					print("Complement.if.f().");
				}

				public void g() {
				}
			}
			Complement complement = new Complement();
			complement.f();

			return complement;
		}
		else {
			class Complement implements WithTwoMethod {
				public void f() {
					print("Complement.else.f().");
				}

				public void g() {
				}
			}
			Complement complement = new Complement();
			complement.f();

			return complement;
		}

	}


	public static void main(String[] args){
		Exercise10 x=new Exercise10();
		x.implementInterface(true);
		x.implementInterface(false);
	}
}
