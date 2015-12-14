package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
//no instance in the test1 and test2,so you can not see output
class Test{
    Test(String s){
        System.out.println("String from constructor:"+s);
    }
}
public class Exercise17 {
    Test[] test1=new Test[5];
    public static void main(String[] args){
        Test[] test2=new Test[4];
    }
}
