package com.elephant.generics;
import com.elephant.util.New;
import typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
	static void f(Map<Person,List<? extends Pet>> peoplePet){}

	public static void main(String[] args){
		//f(New.map());
	}
}
