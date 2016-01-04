package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * The full process of initialization
 *									1.父类静态->子类静态（包括main函数）
 *									2.父类非静态，构造函数
 *									3.子类非静态，构造函数
 */
class Insect{
	private int i=9;
	protected int j;
	Insect(){
		print("i ="+i+", j="+j);
		j=39;
	}
	private static int x1=printInit("static Insect.x1 initialized");
	static int printInit(String s){
		print(s);
		return 47;
	}
}
public class Beetle extends Insect{
	private int k=printInit("Beetle.k initialized");
	public Beetle(){
		print("k="+k);
		print("j="+j);
	}
	private static int x2=printInit("static Beetle.x2 intitialized");
	public static void main(String[] args){
		print("Beetle constructor");
		Beetle b=new Beetle();
	}
}
