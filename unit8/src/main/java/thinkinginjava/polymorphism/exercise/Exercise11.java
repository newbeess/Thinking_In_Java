package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Add class Pickle to SandWich.java
 */
class Meal{
	Meal(){print("Meal()");}
}
class Bread{
	Bread(){print("Bread()");}
}
class Cheese{
	Cheese(){print("Cheese()");}
}
class Lettuce{
	Lettuce(){print("Lettuce()");}
}
class Lunch extends Meal{
	Lunch(){print("Lunch()");}
}
class PortableLunch extends Lunch{
	PortableLunch(){print("PortableLunch()");}
}
class Pickle{
	Pickle(){print("Pickle()");}
}
public class Exercise11 extends PortableLunch{
	Bread b=new Bread();
	Cheese c=new Cheese();
	Lettuce l=new Lettuce();
	Pickle p=new Pickle();
	public Exercise11(){print("Exercise11()");}
	public static void main(String[] args){
		new Exercise11();
	}
}
