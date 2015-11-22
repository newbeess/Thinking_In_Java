package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 */
public class Exercise9 {
    Exercise9(){
        System.out.println("Constructor with no paramter,in the first one.");
    }
    Exercise9(String s){
        this();
        System.out.println("Constructor with String s,in the second one.");
    }
    public static void main(String[] args){
        new Exercise9("s");
    }
}
