package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.print;

/**
 * Modify exercise9 in unit8 ,
 * let Rodent1 be interface
 */
interface Rodent1{
	void hop();
	void scurry();
	void reproduce();
}

class Mouse1 implements Rodent1{
	public void hop() {
		print("Mouse1 hopping");
	}
	public void scurry() {
		print("Mouse1 scurrying");
	}
	public void reproduce() {
		print("Making more Mice");
	}
	public String toString() {
		return "Mouse1";
	}
}
class Gerbil1 implements Rodent1{
	public void hop() {
		print("Gerbil1 hopping");
	}
	public void scurry() {
		print("Gerbil1 scurrying");
	}
	public void reproduce() {
		print("Making more Gerbil1s");
	}
	public String toString() {
		return "Gerbil1";
	}
}
class Hamster1 implements Rodent1{
	public void hop() {
		print("Hamster1 hopping");
	}
	public void scurry() {
		print("Hamster1 scurrying");
	}
	public void reproduce() {
		print("Making more Hamster1s");
	}
	public String toString() {
		return "Hamster1";
	}
}
public class Exercise7 {
	public static void main(String[] args){
		Rodent1[] x={
			new Mouse1(),
			new Gerbil1(),
			new Hamster1(),
		};
		for (Rodent1 r:x) {
			r.hop();
			r.scurry();
			r.reproduce();
			print(r);
		}
	}
}
