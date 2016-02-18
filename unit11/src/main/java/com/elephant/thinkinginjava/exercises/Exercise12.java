package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;


public class Exercise12 {
	static void reverse(List<Integer> list){
		ListIterator<Integer> fwd=list.listIterator();
		ListIterator<Integer> rev=list.listIterator(list.size());
		int mid=list.size() >> 1;
		for (int i=0;i<mid;i++){
			Integer tmp=fwd.next();
			fwd.set(rev.previous());
			rev.set(tmp);
		}
	}
	public static void main(String[] args){
		List<Integer> list1=Arrays.asList(0,1,2,3,4,5);
		List<Integer> list2=new ArrayList<Integer>(list1);

		print(list1);
		print(list2);
		reverse(list1);
		reverse(list2);
		print(list1);
		print(list2);
	}
}
