package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 * Object class can be parameter of printArray,and the instance of null class A's output is
 * classname@it's address
 */

class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for (Object obj:args)
            System.out.println(obj+",");
        System.out.println();
    }
    public static void main(String[] args){
        printArray(new Object[]{
                new Integer(12),new Float(3.1415),new Double(4.44),
        });
        printArray(new Object[]{
            "one","two","three",
        });
        printArray(new Object[]{
            new A(),new A(),new A(),
        });
    }
}
