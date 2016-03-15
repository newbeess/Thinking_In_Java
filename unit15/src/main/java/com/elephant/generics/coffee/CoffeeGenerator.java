package com.elephant.generics.coffee;
import com.elephant.util.*;
import java.util.*;
/**
 * Generate different types of Coffee
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{
	private Class[] types={Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class,};

	private static Random random=new Random(47);
// Constructor
	public CoffeeGenerator(){}
	// For iteration
	private int size=0;
	public CoffeeGenerator(int size){this.size=size;}

	public Coffee next(){
		try {
			return (Coffee)types[random.nextInt(types.length)].newInstance();
			// Report programer errors at run time
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	// inner class
	class CoffeeIterator implements Iterator<Coffee>{
		int count=size;
		public boolean hasNext(){return count>0;}
		public Coffee next(){
			count--;
			return CoffeeGenerator.this.next();
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	};
	// implements Iterable
	public Iterator<Coffee> iterator(){
		return new CoffeeIterator();
	}

	public static void main(String[] args){
		CoffeeGenerator g=new CoffeeGenerator();
		for (int i=0;i<5;i++)
			System.out.println(g.next());
		// Cause implements Iterable interface
		for (Coffee c : new CoffeeGenerator(3))
			System.out.println(c);
	}
}
