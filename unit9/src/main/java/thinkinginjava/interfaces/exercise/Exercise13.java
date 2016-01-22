package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
/**
 * diamond problem
 */
interface BaseInterface{
	void f();
}
interface Leftinherit extends BaseInterface{
	void f();
}
interface Rightinherit extends BaseInterface{
	void f();
}
interface Bottominherit extends Leftinherit,Rightinherit{
	void f();
}
class Combine implements BaseInterface{
	public void f() {
		print("Combine.f()...");
	}
}
public class Exercise13 {
	public static void main(String[] args){
		Combine x=new Combine();
		x.f();
	}
}
