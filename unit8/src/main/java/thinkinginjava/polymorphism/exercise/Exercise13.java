package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;

/**
 * Created by elephant on 16/1/8.
 */
class Shared{
	private int refcount=0;
	public static long counter=0;
	private final long id=counter++;
	public Shared(){
		print("Creating "+this);
	}
	public void addRef(){
		refcount++;
	}
	protected void finalize(){
		if (refcount!=0)
			print("Error! This object is not properly clean-up.");
	}
	protected void dispose(){
		if(--refcount==0)
			print("Disposing "+this);
	}

	@Override
	public String toString() {
		return "Shared "+id;
	}
}
class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing(Shared shared){
		print("Creating "+this);
		this.shared=shared;
		this.shared.addRef();
	}
	protected void dispose(){
		print("disposing "+this);
		shared.dispose();
	}

	@Override
	public String toString() {
		return "Composing "+id;
	}
}
public class Exercise13 {
	public static void main(String[] args){
		Shared shared=new Shared();
		Composing[] composing={
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
		};
		for (Composing c:composing)
			c.dispose();
		System.gc();
		new Composing(new Shared());
		System.gc();
	}
}
