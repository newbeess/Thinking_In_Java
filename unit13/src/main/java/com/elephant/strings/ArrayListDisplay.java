package com.elephant.strings;
import typeinfo.pets.*;
import java.util.*;

public class ArrayListDisplay {
	public static void main(String[] args){
		ArrayList<Pet> pets=new ArrayList<Pet>(Arrays.asList(new Dog(),new Cat()));
		System.out.println(pets);
	}
}
