package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
public class OptionalTrailingArguments {
    static void f(int required,String... argsname){
        System.out.print("Required:"+required+" ");
        for(String s: argsname)
            System.out.print(s+" ");
        System.out.println();
    }
    public static void main(String[] args){
        f(1,"one");
        f(2,"newbeess","github");
        f(0);
    }
}
