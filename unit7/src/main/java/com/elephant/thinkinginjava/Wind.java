package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Inheritance & upcasting.
 */
class Instrument{
	public void play(){print("Instrument.play()");}
	static void tune(Instrument i){
		i.play();
	}
}
/**
 * Wind objects are instruments,
 * because they have the same inteface.
 */
public class Wind extends Instrument{
	public static void main(String[] args){
		Instrument x=new Wind();
		Wind flute=new Wind();
		x.play();
		Instrument.tune(flute);
	}
}
