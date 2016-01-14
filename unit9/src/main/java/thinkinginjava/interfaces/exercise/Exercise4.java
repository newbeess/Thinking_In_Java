package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
/**
 * Create an abstract class with no method,derived a class and add a method.
 * create a static method which receieve references to base class,downcasting to derived class and add it.
 * show it's running status in main.
 * Then add abstract to method in base class
 */
abstract class AbstractClassWithNoMethod{
}
class Extends1 extends AbstractClassWithNoMethod{
	void f(){
		print("Extends1.f()");
	}
}
abstract class WithMethod{
	abstract void g();
}
class Extends2 extends WithMethod{
	@Override
	void g() {
		print("Extends2.g()");
	}
}
public class Exercise4 {
	public static void nomethod(AbstractClassWithNoMethod x){
		//need downcast
		((Extends1)x).f();
	}
	public static void withmethod(WithMethod x){
		//need not downcast
		x.g();
	}
	public static void main(String[] args){
		AbstractClassWithNoMethod e1=new Extends1();
		WithMethod e2=new Extends2();
		nomethod(e1);
		withmethod(e2);

	}
}
