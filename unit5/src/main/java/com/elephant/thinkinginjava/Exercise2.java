package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 */
class InitialAndConstructor{
    String s1="Definition";
    String s2;
    InitialAndConstructor(String s){
        s2=s;
    }
}

public class Exercise2 {
    public static void main(String[] args){
        InitialAndConstructor ic=new InitialAndConstructor("Constructor");
        System.out.println(ic.s1);
        System.out.println(ic.s2);
    }
}
