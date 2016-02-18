package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import java.util.*;
/**
 * Create a class and make an initialized array of your class object.
 * Fill a List from your array.
 * Create a subset of your List using subList(),then remove this subset from your List
 *
 */
class IDClass{
	private static int counter;
	private int count=counter++;
	public String toString(){
		return "IDClass "+count;
	}
}
public class Exercise7 {
	public static void main(String[] args){
		//Define and initialize the array
		IDClass[] idc=new IDClass[10];
		for (int i=0;i<idc.length;i++)
			idc[i]=new IDClass();

		//Fill a list from your array
		List<IDClass> lst=new ArrayList<IDClass>(Arrays.asList(idc));
		print("lst= "+lst);

		//Create subList
		List<IDClass> subSet=lst.subList(lst.size()/4,lst.size()/2);
		print("subSet= "+subSet);

		//remove subSet
		lst.removeAll(subSet);
		print("lst= "+lst);

		//clear()
		lst.clear();
		print("lst= "+lst);
	}
}
