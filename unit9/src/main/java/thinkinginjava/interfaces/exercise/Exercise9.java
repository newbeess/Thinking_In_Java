package thinkinginjava.interfaces.exercise;

import static com.elephant.util.Print.print;

/**
 * Refantor Music5.java,
 * move the common method in Wind,Percusison and Stringed to an abstract class
 */
enum Note{
	MIDDLE_C,HIGHER_C
}

abstract class Instrument{
	//Compile-time constant
	int VALUE=5;//static & final
	public void play(Note n){
		print(this+".play()"+n);
	}
	void adjust(){
		print(this+".adjust()");
	}
	public 	abstract String toString();

}
class Wind extends Instrument{
	public String toString() {return "Wind";}
}
class Percussion extends Instrument{
	public String toString() {
		return "Percussion";
	}
}
class Stringed extends Instrument{
	public String toString() {return "Stringed";}
}
class Brass extends Wind{
	@Override
	public String toString() {
		return "Brass";
	}
}
class Woodwind extends Wind{
	@Override
	public String toString() {
		return "Woodwind";
	}
}

public class Exercise9 {
	//Doesn't care about type,so new types added to the system still work right
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e){
		for (Instrument i:e)
			tune(i);
	}
	public static void main(String[] args){
		//Upcasting during addition to the array
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
