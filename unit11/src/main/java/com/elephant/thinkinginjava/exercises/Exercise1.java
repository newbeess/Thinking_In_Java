package com.elephant.thinkinginjava.exercises;
import java.util.*;

import static com.elephant.util.Print.*;

class GerBil{
	int gerbilnumber;
	GerBil(int gbNumber){
		gerbilnumber=gbNumber;
	}
	public void hop(){
		printnb("gerbil "+gerbilnumber + " :");
		print(" hoping!!");
	}
}

public class Exercise1 {
	public static void main(String[] args){
		ArrayList<GerBil> gerbilList=new ArrayList();
		gerbilList.add(new GerBil(0));
		gerbilList.add(new GerBil(1));
		gerbilList.add(new GerBil(2));
		gerbilList.add(new GerBil(3));

		for (int i=0;i<gerbilList.size();i++)
			gerbilList.get(i).hop();
	}
}
