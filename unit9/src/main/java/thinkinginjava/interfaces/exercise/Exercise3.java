package thinkinginjava.interfaces.exercise;

/**
 * Create an base class with an abstract method "print".
 * Override "print" in subclass,which can print an int variable defined in subclass.
 * Define this variable  with non-zero value.
 * Call this method in base class constructor.
 * Now , create an subclass object in main,call print method.
 */
abstract class BaseWithAbstractPrint{
	BaseWithAbstractPrint(){print();}
	abstract void print();
}
class SubWithPrint extends BaseWithAbstractPrint{
	int i=1;
	@Override
	void print() {
		System.out.println(i);
	}
}
public class Exercise3 {
	public static void main(String[] args){
		SubWithPrint x=new SubWithPrint();
		x.print();
	}
}
