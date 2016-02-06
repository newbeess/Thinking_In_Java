package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 * 	Nested classes can access all member of all levels of the classes they are nested within
 */
class MNA{
	private void f(){print("MNA.f()");}
	class A{
		private void g(){print("MNA.A.g()");}
		public class B{
			void h(){
				print("MNA.A.B.f()");
				g();
				f();
			}
		}
	}
}
public class MultiNestingAccess {
	public static void main(String[] args){
		MNA mna=new MNA();
		MNA.A mnaa=mna.new A();
		MNA.A.B mnaab=mnaa.new B();
		mnaab.h();
	}
}
