package com.elephant.exercises;
import static com.elephant.util.Print.*;
import com.elephant.util.FiveTuple;

/**
 * Created by elephant on 16/3/14.
 */
class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
	public final F sixth;
	public SixTuple(A a,B b,C c,D d,E e,F f){
		super(a,b,c,d,e);
		sixth=f;
	}
	public String toString(){
		return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+", "+sixth+")";
	}
}

public class Exercise3 {
	public static void main(String[] args){
		SixTuple<Integer,Double,String,Character,Boolean,Float> x=
				new SixTuple<Integer, Double, String, Character, Boolean, Float>(1,1.1,"hi",'a',true,1.2f);
		print(x);

	}
}
