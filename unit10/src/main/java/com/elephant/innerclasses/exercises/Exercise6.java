package com.elephant.innerclasses.exercises;

import com.elephant.innerclasses.first.FirstInterface;
import com.elephant.innerclasses.second.Second;

/**
 * Created by elephant on 16/2/3.
 */
public class Exercise6 extends Second{
	public static FirstInterface returnSecond(){
		Second second=new Second();
		FirstInterface SecondInner=second.get();
		return SecondInner;
	}
	public static void main(String[] args){
		returnSecond();
	}
}