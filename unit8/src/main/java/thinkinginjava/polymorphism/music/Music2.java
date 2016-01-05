package thinkinginjava.polymorphism.music;
import static com.elephant.util.Print.*;
/**
 * Overloading instead of upcasting
 * Overloading Music2.tune() method
 */
class Stringed extends Instrument{
	@Override
	public void play(Note n) {
		print("Stringed.play()"+n);
	}
}
class Brass extends Instrument{
	@Override
	public void play(Note n) {
		print("Bass.play()"+n);
	}
}
public class Music2 {
	public static void tune(Wind i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Stringed i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i){
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args){
		Wind flute=new Wind();
		Stringed violin=new Stringed();
		Brass frenchHorn=new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}
