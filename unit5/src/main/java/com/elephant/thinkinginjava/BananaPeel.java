package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * Key word : this
 */

class Banana{
    
    void peel(int i){
        System.out.println("I am peel,this object number is : "+i);
    }
}
public class BananaPeel {
    public static void main(String[] args){
        Banana b1=new Banana(),b2=new Banana();
        b1.peel(1);
        b2.peel(2);
    }
}
