package com.elephant.typeinfo.pets;
import java.util.*;
/**
 * Using class literals
 */
public class LiteralPetCreator extends PetCreator{
	@SuppressWarnings("unchecked")
	public static final List<Class<? extends Pet>> allTypes=Collections.unmodifiableList(Arrays.asList(Pet.class,Mutt.class,Cat.class));

	// Types for random creation:
	private static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
	public List<Class<? extends Pet>> types(){
		return types;
	}
	public static void main(String[] args){
		System.out.println(types);
	}
}
