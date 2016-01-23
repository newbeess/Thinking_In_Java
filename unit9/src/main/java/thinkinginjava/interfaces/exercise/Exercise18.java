package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
/**
 *	Create interface Cycle .
 *	Unicycle, Bicycle,and Tricycle implements it.
 *	Creat factory according to each Cycle type,then use these factory
 */

interface Cycle{
	int wheel();
}
interface CycleFactory{
	Cycle getCycle();
}

/**
 * Unicycle and it's factory
 */
class Unicycle implements Cycle{
	public int wheel() {
		print("One wheel---Unicycle.");
		return 1;
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Unicycle();
	}
}

/**
 * 	Bicycle and it's factory
 */
class Bicycle implements Cycle{
	public int wheel() {
		print("Two wheels---Bicycle.");
		return 1;
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Bicycle();
	}
}

/**
 * 	Tricycle and it's factory
 */
class Tricycle implements Cycle{
	public int wheel() {
		print("Three wheels---Tricycle.");
		return 1;
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle() {
		return new Tricycle();
	}
}
public class Exercise18 {
	public static void countWheels(CycleFactory x){
		Cycle c=x.getCycle();
		c.wheel();
	}
	public static void main(String[] args){
		countWheels(new UnicycleFactory());
		countWheels(new BicycleFactory());
		countWheels(new TricycleFactory());
	}
}
