package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 *	An inner class cannot be overridden like a method
 */

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){print("Egg.Yolk");}
	}
	public Egg(){
		print("new Egg()");
		y=new Yolk();
	}
}

public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){print("BigEgg.Yolk");};
	}
	public static void main(String[] args){
		new BigEgg();
	}
}
