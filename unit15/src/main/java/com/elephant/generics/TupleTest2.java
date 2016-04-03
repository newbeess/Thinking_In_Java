package com.elephant.generics;
import static com.elephant.util.Tuple.*;
import com.elephant.util.*;
/**
 * Created by elephant on 16/4/3.
 */
public class TupleTest2 {

	static TwoTuple<String,Integer> f(){return tuple("hi",11);}

	static TwoTuple f2(){return tuple("hi",11);}

	static ThreeTuple<Amphibian,String,Integer> g(){
		return tuple(new Amphibian(),"hi",11);
	}

	static FourTuple<Vehicle,Amphibian,String,Integer> h(){
		return tuple(new Vehicle(),new Amphibian(),"hi",11);
	}

	static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
		return tuple(new Vehicle(),new Amphibian(),"hi",11,11.11);
	}


	public static void main(String[] args){
		TwoTuple<String,Integer> x=f();
		System.out.println(x);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());

	}
}
