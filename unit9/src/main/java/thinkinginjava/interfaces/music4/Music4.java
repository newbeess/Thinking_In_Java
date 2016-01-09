package thinkinginjava.interfaces.music4;
import static com.elephant.util.Print.*;

/**
 *	Abstract classes and methods.
 */
enum Note{
	MIDDLE_C,HIGHER_C
}
abstract class Instrument{
	private int i; //Storage allocated for each
	public abstract void play(Note c);
	public String what(){return "Instrument";}
	public abstract void adjust();
}
class Wind extends Instrument{
	@Override
	public void play(Note c) {
		print("Wind.play()"+c);
	}

	@Override
	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {}
}
class Percussion extends Instrument{
	@Override
	public void play(Note c) {
		print("Percussion.play()"+c);
	}

	@Override
	public String what() {
		return "Percussion";
	}

	@Override
	public void adjust() {}
}
class Stringed extends Instrument{
	@Override
	public void play(Note c) {
		print("Stringed.play()"+c);
	}

	@Override
	public String what() {
		return "Stringed";
	}

	@Override
	public void adjust() {}
}
class Brass extends Wind{
	@Override
	public void play(Note c) {
		print("Brass.play()"+c);
	}

	@Override
	public String what() {
		return "Brass";
	}

	@Override
	public void adjust() {
		print("Brass.adjust()");
	}
}
class Woodwind extends Wind{
	@Override
	public void play(Note c) {
		print("Woodwind.play()"+c);
	}

	@Override
	public String what() {
		return "Woodwind";
	}
}

public class Music4 {
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e){
		for (Instrument i:e)
			tune(i);
	}
	public static void main(String[] args){
		Instrument[] orchestra={
		new Wind(),
		new Percussion(),
		new Stringed(),
		new Brass(),
		new Woodwind(),
		};
		tuneAll(orchestra);
	}

}
