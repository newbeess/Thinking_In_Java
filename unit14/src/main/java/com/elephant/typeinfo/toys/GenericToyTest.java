package com.elephant.typeinfo.toys;

/**
 * Testing class Class
 */

public class GenericToyTest {
	public static void main(String[] args) throws Exception{
		Class<FancyToy> ftClass=FancyToy.class;
		// Produces exact type:
		FancyToy fancyToy=ftClass.newInstance();
		Class<? super FancyToy> up=ftClass.getSuperclass();
		// This won't compile
		//! Class<Toy> up2=ftClass.getSuperclass();

		// Only produce Object:
		Object onj=up.newInstance();
	}
}
