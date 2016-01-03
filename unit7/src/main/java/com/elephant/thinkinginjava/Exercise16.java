package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Upcasting Forg to Amphibian.
 * Polymorphism happen
 */
class Amphibian{
	public void eat(Amphibian a){print("Amphibian eat.");}
	static void jump(Amphibian a){print("Amphibian jump.");}
	static void activity(Amphibian a){a.eat(a);jump(a);}
}
class Forg extends Amphibian{}
public class Exercise16 {
	public static void main(String[] args){
		Forg f=new Forg();
		f.eat(f);
		Amphibian.activity(f);
		Amphibian.jump(f);
	}
}
