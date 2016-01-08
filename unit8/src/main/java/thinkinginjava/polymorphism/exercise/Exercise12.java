package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Modify Exercise9.java,so it demostrates the order of initialization of the base classes and derived classes.
 * Now add member objects to both the base and derived classes,and show the order in which their initialization
 * occurs during construction.
 */
class Member{
	public Member(String id){
		print("Member constructor "+id);
	}
}
class Rodent2{
	Member m1=new Member("r1"),m2=new Member("r2");
	public Rodent2(){print("Rodent2 constructor");}
	public void hop(){print("Rodent2 hopping");}
	public void scurry(){print("Rodent2 scurrying");}
	public void reproduce(){print("Making more Rodent2s");}
	public String toString() {
		return "Rodent22";
	}
}
class Mouse2 extends Rodent2{
	Member m1=new Member("m1"),m2=new Member("m2");
	public Mouse2(){print("Mouse2 constructor");}
	@Override
	public void hop() {
		print("Mouse2 hopping");
	}

	@Override
	public void scurry() {
		print("Mouse2 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Mice");
	}

	@Override
	public String toString() {
		return "Mouse2";
	}
}
class Gerbil2 extends Rodent2{
	Member m1=new Member("g1"),m2=new Member("g2");
	public Gerbil2(){print("Gerbil2 constructor");}
	@Override
	public void hop() {
		print("Gerbil2 hopping");
	}

	@Override
	public void scurry() {
		print("Gerbil2 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Gerbil2s");
	}

	@Override
	public String toString() {
		return "Gerbil2";
	}
}
class Hamster2 extends Rodent2{
	Member m1=new Member("h1"),m2=new Member("h2");
	public Hamster2(){print("Hadster2 constructor");}
	@Override
	public void hop() {
		print("Hamster2 hopping");
	}
	@Override
	public void scurry() {
		print("Hamster2 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Hamster2s");
	}

	@Override
	public String toString() {
		return "Hamster2";
	}
}

public class Exercise12 {
	public static void main(String[] args){
		new Hamster2();
	}
}
