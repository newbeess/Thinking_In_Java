package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * It only looks like you can override a private or private final method
 */
class WithFinals{
	private final void f(){print("WithFinals.f()");}	//Identical to "private" alone
 	private void g(){print("WithFinals.g()");}			// Also automatically ""final
}
class OverridingPrivate extends WithFinals{
	private final void f(){print("OverridingPrivate.f()");}
	private void g(){print("OverridingPrivate.g()");}
}
class OverridingPrivate2 extends OverridingPrivate{
	public final void f(){print("OverridingPrivate2.f()");}
	public void g(){print("OverridingPrivate2.g()");}
}
public class FinalOverridingIllusion {
	public static void main(String[] args){
		OverridingPrivate2 op2=new OverridingPrivate2();
		op2.f();
		op2.g();
		//Upcasting,
		OverridingPrivate op=op2;
	//	op.f();
	//	op.g();
		WithFinals wf=op2;
	//	op.f();
	//	op.g();
	}
}
