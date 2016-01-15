package thinkinginjava.interfaces.exercise;
import thinkinginjava.interfaces.interfacewiththreemethod.WithThreeMethod;
import static com.elephant.util.Print.*;

/**
 * Implements a interface in another package.
 */

public class Exercise5 implements WithThreeMethod{
	public void f() {
		print("implements f()");
	}

	public void g() {
		print("implements g()");
	}

	public void h() {
		print("implements h()");
	}
	public static void main(String[] args){
		Exercise5 x=new Exercise5();
		x.f();
		x.g();x.h();
	}
}
