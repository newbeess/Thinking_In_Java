package com.elephant.exercises;
import static com.elephant.util.Print.*;
import typeinfo.pets.*;

public class Exercise1<T> {
	private T x;
	public Exercise1(T x){this.x=x;}
	public void set(T x){this.x=x;}
	public T get(){return x;}

	public static void main(String[] args){
		Exercise1<Pet> pet=new Exercise1<Pet>(new Dog("WangWang"));
		print(pet.get());
	}
}
