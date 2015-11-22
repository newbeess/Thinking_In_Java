package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 *
 */
class DefautlConstructor2{
    DefautlConstructor2(){
        System.out.println("DefaultConstructor initialize the object!");
    }
    DefautlConstructor2(String s){
        System.out.println(s+"Constructor with parameter:"+s);
    }
}
public class Exercise4 {
    public static void main(String[] args){
        DefautlConstructor2 dc1=new DefautlConstructor2();
        DefautlConstructor2 dc2=new DefautlConstructor2("I am the paramter!");
    }
}
