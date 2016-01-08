package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Modify Exercise9.java,so it demostrates the order of initialization of the base classes and derived classes.
 * Now add NonSharedMember objects to both the base and derived classes,and show the order in which their initialization
 * occurs during construction.
 */
class NonSharedMember{
	public NonSharedMember(String id){
		print("NonSharedMember constructor "+id);
	}
}
class SharedMember{
	private int refcount;
	public void addRef(){
		print("Number of reference "+ ++refcount);
	}
	protected void dispose(){
		if (--refcount==0)
			print("Disposing "+this);
	}
	public SharedMember(){
		print("SharedMember constructor");
	}

	@Override
	public String toString() {
		return "Shared Member";
	}
}
class Rodent3{
	private SharedMember m;
	NonSharedMember m1=new NonSharedMember("r1"),m2=new NonSharedMember("r2");
	public Rodent3(SharedMember sm){
		print("Rodent3 constructor");
		m=sm;
		m.addRef();
	}
	public void hop(){print("Rodent3 hopping");}
	public void scurry(){print("Rodent3 scurrying");}
	public void reproduce(){print("Making more Rodent3s");}
	protected void dispose(){
		print("Disposing "+this);
		m.dispose();
	}
	public String toString() {
		return "Rodent32";
	}
}
class Mouse3 extends Rodent3{
	NonSharedMember m1=new NonSharedMember("m1"),m2=new NonSharedMember("m2");
	public Mouse3(SharedMember sm){
		super(sm);
		print("Mouse3 constructor");
	}
	@Override
	public void hop() {
		print("Mouse3 hopping");
	}

	@Override
	public void scurry() {
		print("Mouse3 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Mice");
	}

	@Override
	public String toString() {
		return "Mouse3";
	}
}
class Gerbil3 extends Rodent3{
	private SharedMember m;
	NonSharedMember m1=new NonSharedMember("g1"),m2=new NonSharedMember("g2");
	public Gerbil3(SharedMember sm){
		super(sm);
		print("Gerbil3 constructor");
	}
	@Override
	public void hop() {
		print("Gerbil3 hopping");
	}

	@Override
	public void scurry() {
		print("Gerbil3 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Gerbil3s");
	}

	@Override
	public String toString() {
		return "Gerbil3";
	}
}
class Hamster3 extends Rodent3{
	SharedMember m;
	NonSharedMember m1=new NonSharedMember("h1"),m2=new NonSharedMember("h2");
	public Hamster3(SharedMember sm){
		super(sm);
		print("Hadster2 constructor");
	}
	@Override
	public void hop() {
		print("Hamster3 hopping");
	}
	@Override
	public void scurry() {
		print("Hamster3 scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Hamster3s");
	}

	@Override
	public String toString() {
		return "Hamster3";
	}
}

public class Exercise14 {
	public static void main(String[] args){
		SharedMember sm=new SharedMember();
		Rodent3[] rodents={
				new Mouse3(sm),
				new Gerbil3(sm),
				new Hamster3(sm),
		};
		for (Rodent3 r:rodents)
			r.dispose();
	}
}
