package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;

/**
 * Modify Music5.java add interface Playable,
 * move play() from Instrument1 to Playable.
 * Include Playable in the implements list and add to the derived class.
 * Change tune, so it takes a Playable instead of an Instrument1.
 */
enum Note1{
	MIDDLE_C,HIGHER_C
}
interface Playable{
	void play(Note1 n);
}


interface Instrument1{
	void adjust();
}
class Wind1 implements Instrument1,Playable{
	public void play(Note1 n) {
		print(this+".play()"+n);
	}

	@Override
	public String toString() {
		return "Wind1";
	}

	public void adjust() {
		print(this+".adjust()");
	}
}
class Percussion1 implements Instrument1,Playable{
	public void play(Note1 n) {
		print(this+".play()"+n);
	}

	@Override
	public String toString() {
		return "Percussion1";
	}

	public void adjust() {
		print(this+".adjust()");
	}
}
class Stringed1 implements Instrument1,Playable{
	public void play(Note1 n) {
		print(this+".play()"+n);
	}

	@Override
	public String toString() {
		return "Stringed1";
	}

	public void adjust() {
		print(this+".adjust()");
	}
}
class Brass1 extends Wind1{
	@Override
	public String toString() {
		return "Brass1";
	}
}
class WoodWind1 extends Wind1{
	@Override
	public String toString() {
		return "WoodWind1";
	}
}

public class Exercise10 {
	//Doesn't care about type,so new types added to the system still work right
	static void tune(Playable i){
		i.play(Note1.MIDDLE_C);
	}
	static void tuneAll(Playable[] e){
		for (Playable i:e)
			tune(i);
	}
	public static void main(String[] args){
		//Upcasting during addition to the array
		Playable[] orchestra={
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new WoodWind1(),
		};
		tuneAll(orchestra);
	}
}
