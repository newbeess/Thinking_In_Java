package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * Verify if we must use this in same class different function
 */
public class Exercise8 {
    void first(){
        System.out.println("I am the first function.");
        second();
        this.second();
    }
    void second(){
        System.out.println("I am the second function.");
    }
    public static void main(String[] args){
    Exercise8 exercise8=new Exercise8();
        exercise8.first();
    }
}
