package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/19.
 */
public class Literals {
    public static void main(String[] args){
        //Hexadecimal
        int i1=0x2f; //hexadecimal(lowercase)
        System.out.println("i1: "+ Integer.toBinaryString(i1));
        int i2=0x2F; //hexadeciaml (uppercase)
        System.out.println("i2: "+Integer.toBinaryString(i2));
        //Octal
        int i3=0177; //Octal (leading zero)
        System.out.println("i3: "+Integer.toBinaryString(i3));
        //Char
        char c=0xfff; //max char hex value
        System.out.println("c: "+Integer.toBinaryString(c));
        //Byte
        byte b=0x7f; //max byte hex value
        System.out.println("b: "+Integer.toBinaryString(b));
        //Short
        short s=0x7ff; //max short hex value
        System.out.println("s: "+Integer.toBinaryString(s));
        //Long
        long n1=0x2f; //long suffix
        System.out.println("n1: "+Long.toBinaryString(n1));
        long n2=0x2F; //long suffix(but can be confusing)
        System.out.println("n2: "+Long.toBinaryString(n2));
        long n3=0177;
        System.out.println("n3: "+Long.toBinaryString(n3));
        //Float
        float f1=1;
        float f2=1F; //float suffix
        float f3=1f; //float suffix
        //Double
        double d1=1d;
        double d2=1D;
    }
}
