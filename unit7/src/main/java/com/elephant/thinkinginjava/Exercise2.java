package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/30.
 */
import static com.elephant.util.Print.*;

public class Exercise2 extends Detergent{

	@Override
	public void scrub() {
		super.scrub();
	}
	public void sterilize(){
		append("sterilize()");
	}

	public static void main(String[] args){
		Exercise2 exercise2=new Exercise2();
		exercise2.scrub();
		exercise2.sterilize();
		print(exercise2);
	}
}
