package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * Test if different paramter order can overloading
 */
class Dog1{
    void bark(int i,String s){
        System.out.print("Int first,String second.");
        System.out.println("barking!");
    }
    void bark(String s,int i){
        System.out.print("String first,Int second.");
        System.out.println("howling");
    }
}
public class Exercise6 {
    public static void main(String[] args){
        Dog1 dog1=new Dog1();
        dog1.bark(1,"2");
        dog1.bark("1",2);
    }
}
