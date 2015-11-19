package com.elephant.thikinginjava;

import java.util.*;
/**
 * simulate throw coin
 *
 */
public class Exercise7 {
    public static void main(String[] args){
        Random rand=new Random(47);
        boolean coin=rand.nextBoolean();
        System.out.print("This time your coin is : ");
        System.out.println(coin? "Front":"Reverse");
    }
}
