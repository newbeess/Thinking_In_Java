package com.elephant.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator{
	private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
	// Types that you want to be randomly created:
	private static String[] typeNames={
			"com.elephant.typeinfo.pets.Pug",
			"com.elephant.typeinfo.pets.Mutt",
			"com.elephant.typeinfo.pets.EgyptianMau",
			"com.elephant.typeinfo.pets.Manx",
			"com.elephant.typeinfo.pets.Cymric",
			"com.elephant.typeinfo.pets.Rat"
	};
	@SuppressWarnings("unchecked")
	private static void loader(){
		try {
			for (String name : typeNames)
				types.add((Class<? extends Pet>)Class.forName(name));
		} catch (ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	static {loader();}
	public List<Class<? extends Pet>> types() {
		return types;
	}
}
