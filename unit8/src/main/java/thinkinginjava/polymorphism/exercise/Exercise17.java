package thinkinginjava.polymorphism.exercise;

import static com.elephant.util.Print.print;

/**
 * Add balance method to Unicycle and Bicycle class,not to Tricycle.
 * Create three type reference in a Cycle array.
 * Trying to call balance method on each element of the array
 * Downcasting and call again ,observe what happens
 */
class Cycle1{
	public void ride(Cycle1 c){
		print("Cycle1.ride()");
	}
	public int wheel(){return 0;}
}
class UniCycle1 extends Cycle1{
	@Override
	public void ride(Cycle1 c) {
		print("UniCycle1.ride()");
	}

	@Override
	public int wheel() {
		return 1;
	}
	public void balance(){
		print("UniCycle1.balance()");
	}
}
class BiCycle1 extends Cycle1{
	@Override
	public void ride(Cycle1 c) {
		print("BiCycle1.ride()");
	}

	@Override
	public int wheel() {
		return 2;
	}
	public void balance(){
		print("Bicycle1.balance()");
	}
}
class TriCycle1 extends Cycle1{
	@Override
	public void ride(Cycle1 c) {
		print("TriCycle1.ride()");
	}

	@Override
	public int wheel() {
		return 3;
	}
}

public class Exercise17 {
	public static void main(String[] args){
		Cycle1[] cycle={
			new UniCycle1(),new BiCycle1(),new TriCycle1(),
		};
//Compile time :method can't found
//		cycle[0].balance;
//		cycle[1].balance;
//		cycle[2].balance;
		((UniCycle1)cycle[0]).balance();
		((BiCycle1)cycle[1]).balance();
		((UniCycle1)cycle[2]).balance();

	}
}
