package thinkinginjava.polymorphism;
import sun.security.krb5.internal.crypto.Des;

import static com.elephant.util.Print.*;
/**
 * Cleanup & inheritance
 */
class Characteristic{
	private String s;
	Characteristic(String s){
		this.s=s;
		print("Creating  Characteristic "+s);
	}
	protected void dispose(){
		print("Disposing Characristic "+s);
	}
}
class Description{
	private String s;
	Description(String s){
		this.s=s;
		print("Creating Description "+s);
	}
	protected void dispose(){
		print("Disposing Description "+s);
	}
}
class LivingCreature{
	private Characteristic p=new Characteristic("is live");
	private Description t=new Description("Basic Living Creature");
	LivingCreature(){
		print("LivingCreature()");
	}

	/**
	 * dispose order is opposited of initialization
	 */
	protected void dispose(){
		print("Dipose LivingCreature");
		t.dispose();
		p.dispose();
	}
}
class Animal extends LivingCreature{
	private Characteristic p=new Characteristic("has heart");
	private Description t=new Description("Animal not Vegetable");
	Animal(){print("Animal()");}
	protected void dispose(){
		print("Disposing Animal");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
class Amphibian extends Animal{
	private Characteristic p=new Characteristic("can live in water");
	private Description t=new Description("Both water and land");
	Amphibian(){
		print("Amphibian()");
	}
	protected void dispose(){
		print("Disposing Amphibian");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
public class Frog extends Amphibian{
	private Characteristic p=new Characteristic("Croaks");
	private Description t= new Description("Eats Bugs");
	public Frog(){
		print("Forg()");
	}

	@Override
	protected void dispose() {
		print("Disposing Forg");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args){
		Frog frog=new Frog();
		print("Bye");
		frog.dispose();
	}
}
