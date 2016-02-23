package com.elephant.thinkinginjava.holding;
import static com.elephant.util.Print.*;
import java.util.*;

public class SetOfInteger {
	public static void main(String[] args){
		Random random=new Random(47);
		Set<Integer> intset=new HashSet<Integer>();
		for (int i=0;i<10000;i++)
			intset.add(random.nextInt(40));
		print(intset);
	}
}
