package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 */
class Dog{
    void bark(){
        System.out.println("barking!");
    }
    void bark(String s){
        System.out.println("howling");
    }
}
public class Exercise5 {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.bark();
        dog.bark("howling");
    }
}
