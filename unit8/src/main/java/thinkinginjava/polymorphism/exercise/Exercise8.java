package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
import thinkinginjava.polymorphism.music.Note;

import java.util.Random;
/**
 * Modify Music3.java
 *  use it like Shapes.java to randomly generate object
 */

/**
 * Base class,Instrument1
 */
class Instrument1{
	void play(Note n){print("Instrument1.play()"+n);}
	String what(){return "Instrument1";}
	void adjust(){print("Adjusting Instrument1");}
}

/**
 * Subclass of Instrument1, Wind1
 */
class Wind1 extends Instrument1{
	@Override
	void play(Note n) {
		print("Wind1.play()"+n);
	}
	String what(){return "Wind1";}

	@Override
	void adjust() {
		print("Adjusting Wind1");
	}
}

/**
 * Subclass of Instrument1, Percussion1
 */
class Percussion1 extends Instrument1{
	@Override
	void play(Note n) {
		print("Percussion1.play()"+n);
	}
	String what(){return "Perssion";}

	@Override
	void adjust() {
		print("Adjusting Perssion");
	}
}

/**
 * Subclass of Instrument1 ,Stringed1
 */
class Stringed1 extends Instrument1{
	@Override
	void play(Note n) {
		print("Stringed1.play()"+n);
	}
	String what(){return "Stringed1";}

	@Override
	void adjust() {
		print("Adjusting Stringed1");
	}
}

/**
 * Subclass of Wind1,Brass1
 */
class Brass1 extends Wind1{
	@Override
	void play(Note n) {
		print("Brass1.play()"+n);
	}

	@Override
	void adjust() {
		print("Adjusting Brass1");
	}
}

/**
 * Subclass of Wind1,WoodWind1
 */
class WoodWind1 extends Wind1{
	@Override
	void play(Note n) {
		print("WoodWind1.play()"+n);
	}
	String what(){return "WoodWind1";}
}

/**
 * Type generator,generate music type
 */
class MusicGenerator{
	private Random random=new Random(47);
	public Instrument1 next(){
			switch (random.nextInt(5)){
				default:
				case 0:return new Wind1();
				case 1:return new Percussion1();
				case 2:return new Stringed1();
				case 3:return new WoodWind1();
				case 4:return new Brass1();
			}
	}
}


/**
 * Doesn't care about type,so new types added to the system still work right
 */

public class Exercise8 {
	public static void main(String[] args){
		MusicGenerator musicGenerator=new MusicGenerator();
		Instrument1[] instrument1=new Instrument1[10];
		for(int i=0;i<instrument1.length;i++)
			instrument1[i]=musicGenerator.next();
		for (Instrument1 i1:instrument1){
			i1.play(Note.B_FLAT);
			print(i1);
		}
	}
}

