package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;

import thinkinginjava.polymorphism.music.Note;
import thinkinginjava.polymorphism.music3.*;
/**
 * Add a new subclass of Instrument to Music3.java
 * Vercify the polymorphism works for your new type
 */
class NewInstrument extends Instrument{
	@Override
	void play(Note n) {
		print("NewInstrument.play()"+n);
	}

	@Override
	public String toString() {
		return "NewInstrument";
	}
}
public class Exercise7 {
	static Instrument[] orchestra={
			new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind(),new NewInstrument()
	};
	public static void main(String[] args) {
		for (Instrument i :orchestra) {
			i.play(Note.MIDDLE_C);
			print(i);
		}
	}
}
