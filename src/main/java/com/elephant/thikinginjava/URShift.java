package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/19.
 */
public class URShift {
    public static void main(String[] args){
        //int
        int i=-1;
        System.out.println(Integer.toBinaryString(i));
        i >>>=10;
        System.out.println(Integer.toBinaryString(i));
        //long
        long l=-1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        //short
        short s=-1;
        System.out.println(Integer.toBinaryString(s));
        s >>>=10;
        System.out.println(Integer.toBinaryString(s));
        //byte
        byte b=-1;
        System.out.println(Integer.toBinaryString(b));
        b >>>=10;
        System.out.println(Integer.toBinaryString(b));
        //
        b=-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));

    }
}
