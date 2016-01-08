package thinkinginjava.polymorphism;
import static com.elephant.util.Print.*;
/**
 * Trying to override a private method
 * Private method can't be overrided
 */
public class PrivateOverride {
	private void f(){print("private f()");}
	public static void main(String[] args){
		PrivateOverride po=new Derived();
		po.f();
	}
}
class Derived extends PrivateOverride{
	public void f(){print("public f()");}
}