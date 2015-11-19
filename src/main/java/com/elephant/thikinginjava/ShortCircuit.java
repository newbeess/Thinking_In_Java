package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/19.
 */
public class ShortCircuit {
    static boolean test1(int val){
        System.out.print("test1(" + val + ")");
        System.out.println("result: "+(val<1));
        return val<1;
    }
    static boolean test2(int val){
        System.out.print("test2(" + val + ")");
        System.out.println("result: "+(val<2));
        return val<2;
    }
    static boolean test3(int val){
        System.out.print("test3(" + val + ")");
        System.out.println("result: "+(val<3));
        return val<3;
    }
    public static void main(String[] args){
     boolean b=test1(1) && test2(2) && test3(2);
        System.out.print("expression b is: "+b);
    }
}
