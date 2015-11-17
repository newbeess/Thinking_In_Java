package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/17.
 */
class Incrementable{
    static int  i=1;
     void increment(){
     i++;
    }
}
public class Exercise7 {
    public static void main(String[] args){
        Incrementable sf=new Incrementable();
        System.out.println("Before change the value of static int i is:"+Incrementable.i);
        sf.increment();
        System.out.println("After change the value of static int i is:"+sf.i);

    }
}
