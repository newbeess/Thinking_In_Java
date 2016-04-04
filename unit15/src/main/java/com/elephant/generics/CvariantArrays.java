package com.elephant.generics;

/**
 * Created by elephant on 16/4/4.
 */
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}


public class CvariantArrays {
	public static void main(String[] args){

		Fruit[] fruits=new Apple[10];
		fruits[0]=new Apple();
		fruits[1]=new Jonathan();
		try {
			fruits[0]=new Fruit();
		}catch (Exception e){
			System.out.println(e);
		}
		try {
			fruits[0]=new Orange();
		}catch (Exception e){
			System.out.println(e);
		}

	}
}
