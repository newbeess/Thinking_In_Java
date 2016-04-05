package com.elephant.generics;

/**
 * Created by elephant on 16/4/4.
 */
public class Holder<T> {
	private T value;
	public Holder(){}
	public Holder(T val){value=val;}
	public void set(T val){value=val;}
	public T get(){return value;}
	public boolean equals(Object object){
		return value.equals(object);
	}



	public static void main(String[] args){
		Holder<Apple> Apple=new Holder<Apple>(new Apple());
		Apple d=Apple.get();
		Apple.set(d);
		//Holder<Fruit> Fruit=Apple;
		Holder<? extends Fruit> fruits=Apple;
		Fruit p=fruits.get();
		d=(Apple)fruits.get();
		try {
			Orange c=(Orange)fruits.get();
		} catch (Exception e){
			System.out.println(e);
		}
	//	fruits.set(new Apple());
	//	fruits.set(new Fruit());
		System.out.println(fruits.equals(d));
	}

}
