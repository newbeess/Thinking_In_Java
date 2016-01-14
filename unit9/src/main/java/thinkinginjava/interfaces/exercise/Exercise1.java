package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
/**
 * Modify Rodent class in unit 8 to be abstract class.,
 */
abstract class Rodent{
	public abstract void hop();
	public abstract void scurry();
	public abstract void reproduce();

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
public class Exercise1 {
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
