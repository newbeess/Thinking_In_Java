package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
public class Exercise19 {
    static void f(String... args){
        for(String s:args)
            System.out.println(s);
    }
    public static void main(String[] args){
        Exercise19 exercise19=new Exercise19();
        //transmit String list
        exercise19.f(new String("hello1"),new String("hello2"));
        //transmit String[]
        String[] Sarray=new String[] {"hi1","hi2","hi3"};
        exercise19.f(Sarray);
    }
}
