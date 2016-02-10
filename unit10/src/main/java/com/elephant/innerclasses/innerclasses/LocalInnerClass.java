package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 *	Holds a sequence of Objects.
 */

interface Counter{
	int next();
}
public class LocalInnerClass {
	private int count=0;

	Counter getCounter(final String name){
		// A local inner class
		class LocalCounter implements Counter{
			public LocalCounter(){
				//	Local inner class can have a constructor
				print("LocalCounter");
			}
			public int next(){
				printnb(name);	// Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}

	//	The same thing with an anonymous inner class
	Counter getCounter2(final String name){
		return new Counter() {
			//	anonymous inner class cannot have a named constructor,only an insure initializer
			{print("Counter()");}
			public int next() {
				printnb(name);
				return count++;
			}
		};
	}
	public static void main(String[] args){
		LocalInnerClass lic=new LocalInnerClass();
		Counter
				t1=lic.getCounter("Local inner"),
				t2=lic.getCounter2("Anonymous inner");
		for (int i=0;i<5;i++)
			print(t1.next());
		for (int i=0;i<5;i++)
			print(t2.next());
	}

}

