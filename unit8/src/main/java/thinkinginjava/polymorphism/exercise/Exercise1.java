package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Superclass: Cycle
 * Subclass: Unicycle,Bicycle,Tricycle
 */
class Cycle{
	public void ride(Cycle c){
		print("Cycle.ride()");
	}
	public int wheel(){return 0;}
}
class Unicycle extends Cycle{
	@Override
	public void ride(Cycle c) {
		print("Unicycle.ride()");
	}

	@Override
	public int wheel() {
		return 1;
	}
}
class Bicycle extends Cycle{
	@Override
	public void ride(Cycle c) {
		print("Bicycle.ride()");
	}

	@Override
	public int wheel() {
		return 2;
	}
}
class Tricycle extends Cycle{
	@Override
	public void ride(Cycle c) {
		print("Tricycle.ride()");
	}

	@Override
	public int wheel() {
		return 3;
	}
}
public class Exercise1 {
	public static void ride(Cycle c){
		print("Exercise1.ride()");
	}
	public static void main(String[] args){
		Cycle c=new Cycle();
		c.ride(c);
		ride(c);
		Unicycle u=new Unicycle();
		u.ride(u);
		ride(u);
		Bicycle b=new Bicycle();
		b.ride(b);
		ride(b);
		Tricycle t=new Tricycle();
		t.ride(t);
		ride(t);
	}
}
