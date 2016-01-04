package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Use @override annotation
 */
class OverridingPrivate20 extends WithFinals{
//	@Override
	private final void f(){print("OverridingPrivate20.f()");}
//	@Override
	private final void g(){print("OverridingPrivate20.g()");}
}
class OverridingPrivate2_20 extends WithFinals{
//	@Override
	public final void f(){print("OverridingPrivate2_20.f()");}
//	@Override
	public final void g(){print("OverridingPrivate2_20.g()");}
}
public class Exercise20 {
	public static void main(String[] args){
		OverridingPrivate2_20 x=new OverridingPrivate2_20();
		x.f();
		x.g();
	}
}
