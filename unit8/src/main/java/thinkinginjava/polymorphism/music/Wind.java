package thinkinginjava.polymorphism.music;
import static com.elephant.util.Print.*;
/**
 * Wind objects are instruments
 */

public class Wind extends Instrument{
	//Refine interface method
	public void play(Note n) {
		print("Wind.play()"+n);
	}
}
