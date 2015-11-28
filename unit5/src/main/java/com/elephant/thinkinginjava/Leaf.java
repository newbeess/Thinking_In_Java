package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * return this
 */
public class Leaf {
    int i=0;
    Leaf incrment(){
        i++;
        return this;
    }
    void p(){
        System.out.println("i="+i);
    }
    public static void main(String[] args){
        Leaf leaf=new Leaf();
        leaf.incrment().incrment().incrment();
        leaf.p();
    }
}
