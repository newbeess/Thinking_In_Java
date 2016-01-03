package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Cover methods in Amphibian
 */
class Forg1 extends Amphibian{
	public void eat(Amphibian a){print("Forg1.eat");}
	static void jump(Amphibian a){print("forg1.jump");}
	static void activity(Amphibian a){a.eat(a);jump(a);}
}
public class Exercise17 {
	public static void main(String[] args){
		Forg1 f=new Forg1();
		f.eat(f);
		Amphibian.activity(f);
	}
}
