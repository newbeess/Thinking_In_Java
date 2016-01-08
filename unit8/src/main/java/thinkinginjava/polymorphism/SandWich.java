package thinkinginjava.polymorphism;
import static com.elephant.util.Print.*;
/**
 * Order of constructor calls
 * Notice:有继承关系，先初始化基类
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
public class SandWich extends PortableLunch{
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	public SandWich(){print("SandWich()");}
public static void main(String[] args){
		new SandWich();
	}
}
