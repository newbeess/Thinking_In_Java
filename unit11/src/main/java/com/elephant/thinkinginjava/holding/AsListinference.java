package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 *	Arrays.asList() makes its best guess about type
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
	public static void main(String[] args){
		List<Snow> snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());
		print(snow1);
		//Won't compile:
		//! List<Snow> snow2=Arrays.asList(new Light(),new Heavy());

		//Collections.addAll() doesn't  get confused
		List<Snow> snow3=new ArrayList<Snow>();
		Collections.addAll(snow3,new Crusty(),new Powder());
		print(snow3);

		//Give a hint using an explicit type argument specification
		List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
		print(snow4);
	}
}
