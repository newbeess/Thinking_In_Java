package com.elephant.exercises;


import static com.elephant.util.Print.print;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
//	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){super(1);}
}

public class Exercise1 {
	static void printInfo(Class cc){
		print("Class name: "+cc.getName()+" is interface? ["+cc.isInterface()+"]");
		print("Simple name: "+cc.getSimpleName());
		print("Canonical name : "+cc.getCanonicalName());
	}

	public static void main(String[] args){
		Class c=null;
		try {
			c=Class.forName("com.elephant.typeinfo.toys.FancyToy");
		}catch (ClassNotFoundException e){
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up=c.getSuperclass();
		Object obj=null;
		try {
			// Require default constructor
			obj=up.newInstance();
		} catch (InstantiationException e){
			print("Can't instantiate");
			System.exit(1);
		} catch (IllegalAccessException e){
			print("Can't access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}