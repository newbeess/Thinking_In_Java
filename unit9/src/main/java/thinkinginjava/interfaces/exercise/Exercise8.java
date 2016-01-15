package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
/**
 * Create interface "FastFood" in polymorphism.Sandwich.java ,
 * Modify Sandwich and implements FastFood
 */
interface FastFood{
	void rushOrder();
	void gobble();
}
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
class SandWich extends PortableLunch{
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	public SandWich(){print("SandWich()");}

}
class FastSandwich extends SandWich implements FastFood{
	public void rushOrder() {
		print("FastSandwich.rushOrder().");
	}

	public void gobble() {
		print("FastSandwich.vobble()");
	}
}
public class Exercise8 {
	public static void main(String[] args){
		FastSandwich x=new FastSandwich();
		print("11111");
		print("22222");
		x.rushOrder();
		x.gobble();
	}
}
