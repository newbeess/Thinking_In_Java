package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Create Rodent:Mouse,Gerbil,Hamster and so on.
 * Support all common method for Rodent,and override part of them on specify subclass
 * At last,create an array and call method in base class
 */
class Rodent{
	public void hop(){print("Rodent hopping");}
	public void scurry(){print("Rodent scurrying");}
	public void reproduce(){print("Making more Rodents");}

	@Override
	public String toString() {
		return "Rodent";
	}
}
class Mouse extends Rodent{
	@Override
	public void hop() {
		print("Mouse hopping");
	}

	@Override
	public void scurry() {
		print("Mouse scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Mice");
	}

	@Override
	public String toString() {
		return "Mouse";
	}
}
class Gerbil extends Rodent{
	@Override
	public void hop() {
		print("Gerbil hopping");
	}

	@Override
	public void scurry() {
		print("Gerbil scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Gerbils");
	}

	@Override
	public String toString() {
		return "Gerbil";
	}
}
class Hamster extends Rodent{
	@Override
	public void hop() {
		print("Hamster hopping");
	}

	@Override
	public void scurry() {
		print("Hamster scurrying");
	}

	@Override
	public void reproduce() {
		print("Making more Hamsters");
	}

	@Override
	public String toString() {
		return "Hamster";
	}
}
public class Exercise9 {
	public static void main(String[] args) {
		Rodent[] rodents = {
				new Mouse(),
				new Gerbil(),
				new Hamster(),
		};
		for(Rodent r:rodents){
			r.hop();
			r.scurry();
			r.reproduce();
			print(r);
		}
	}
}
