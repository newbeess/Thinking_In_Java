package thinkinginjava.polymorphism.music3;
import static com.elephant.util.Print.*;
import thinkinginjava.polymorphism.music.Note;
/**
 * An extensible program
 */

/**
 * Base class,Instrument
 */
class Instrument{
	void play(Note n){print("Instrument.play()"+n);}
	String what(){return "Instrument";}
	void adjust(){print("Adjusting Instrument");}
}

/**
 * Subclass of Instrument, Wind
 */
class Wind extends Instrument{
	@Override
	void play(Note n) {
		print("Wind.play()"+n);
	}
	String what(){return "Wind";}

	@Override
	void adjust() {
		print("Adjusting Wind");
	}
}

/**
 * Subclass of Instrument, Percussion
 */
class Percussion extends Instrument{
	@Override
	void play(Note n) {
		print("Percussion.play()"+n);
	}
	String what(){return "Perssion";}

	@Override
	void adjust() {
		print("Adjusting Perssion");
	}
}

/**
 * Subclass of Instrument ,Stringed
 */
class Stringed extends Instrument{
	@Override
	void play(Note n) {
		print("Stringed.play()"+n);
	}
	String what(){return "Stringed";}

	@Override
	void adjust() {
		print("Adjusting Stringed");
	}
}

/**
 * Subclass of Wind,Brass
 */
class Brass extends Wind{
	@Override
	void play(Note n) {
		print("Brass.play()"+n);
	}

	@Override
	void adjust() {
		print("Adjusting Brass");
	}
}

/**
 * Subclass of Wind,Woodwind
 */
class Woodwind extends Wind{
	@Override
	void play(Note n) {
		print("Woodwind.play()"+n);
	}
	String what(){return "Woodwind";}
}

/**
 * Doesn't care about type,so new types added to the system still work right
 */
public class Music3 {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e)
			tune(i);
	}
	public static void main(String[] args){
		Instrument[] orchestra={new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
		tuneAll(orchestra);
	}
}
