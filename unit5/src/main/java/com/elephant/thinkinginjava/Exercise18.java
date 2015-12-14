package com.elephant.thinkinginjava;
/**
 * Created by elephant on 15/12/14.
 */

/**
 * complete the former exercise by create object
 */
public class Exercise18 {
    public static void main(String[] args){
        Test[] test3=new Test[5];
        for(int i=0;i<test3.length;i++)
            test3[i]=new Test(Integer.toString(i));

    }
}
