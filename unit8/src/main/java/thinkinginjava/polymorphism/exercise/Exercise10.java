package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Create a base class with two methods,and the first one can call the second.
 * Create a subclass which override the second method.
 * At last, use the object of sunclass upcasting to base class and call the first method
 *
 */
class BaseWithTwoMethods{
	public void firstMethod(){print("Base-first method.call second one");secondMethod();}
	public void secondMethod(){print("Base-second method.");}
}
class SubOverrideSecondMethod extends BaseWithTwoMethods{
	@Override
	public void secondMethod() {
		print("Sub-second method");
	}
}
public class Exercise10 {
	public static void  main(String[] args){
		BaseWithTwoMethods subupcasting=new SubOverrideSecondMethod();
		subupcasting.firstMethod();
	}
}
