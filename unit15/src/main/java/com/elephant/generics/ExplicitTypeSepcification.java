package com.elephant.generics;
import typeinfo.pets.*;
import java.util.*;
import com.elephant.util.*;

public class ExplicitTypeSepcification {
	static void f(Map<Person,List<Pet>> peoplePet){}
	public static void main(String[] args){
		f(New.<Person,List<Pet>>map());
	}
}
