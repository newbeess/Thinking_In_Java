package com.elephant.containers;
import java.util.*;
import com.elephant.util.*;
/**
 * Created by elephant on 16/4/8.
 */
class Government implements Generator<String>{
	String[] foundation=("strange women lying in pounds disturbing swords is no basic"+
			  			 " for a system of government"
						).split(" ");
	private int index;
	public String next(){return foundation[index];}
}

public class CollectionDataTest {
	public static void main(String[] args){
		Set<String> set=new LinkedHashSet<String>(new CollectionData<String>(new Government(),15));
		// Using convience method
		set.addAll(CollectionData.list(new Government(),15));
		System.out.println(set);
	}
}
