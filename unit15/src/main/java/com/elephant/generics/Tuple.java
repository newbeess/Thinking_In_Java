package com.elephant.generics;

import com.elephant.util.FourTuple;
import com.elephant.util.ThreeTuple;
import com.elephant.util.TwoTuple;

/**
 * Created by elephant on 16/4/3.
 */
public class Tuple {
	public static <A,B> TwoTuple<A,B> tuple(A a,B b){
		return new TwoTuple<A, B>(a,b);
	}
	public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b,C c){
		return new ThreeTuple<A, B,C>(a,b,c);
	}
	public static <A,B,C,D> FourTuple<A,B,C,D> tuple(A a,B b,C c,D d){
		return new FourTuple<A, B,C,D>(a,b,c,d);
	}

}
