package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/17.
 */
public class Exercise6 {
    String s="Hello,world!";
    int storage(String s){
        return s.length();
    }
    void print(){
        System.out.println("the value of s is:"+s);
        System.out.println("storage(s)= "+storage(s));
    }
    public static void main(String[] args){
        Exercise6 exercise6=new Exercise6();
        exercise6.print();
    }
}
