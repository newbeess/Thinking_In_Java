package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/16.
 */

/**验证int，char类型到默认初始化值。
 * @author elephant
 * @version 1.0
 */

class Test{
    int i;
    char c;
    float f;
    double d;
    short s;
    long l;
    boolean b;
    byte by;
}

public class Exercise1 {
    public static void main(String[] args) {
       Test test=new Test();
        System.out.println("The default value of INT is: "+test.i);
        System.out.println("The default value of CHAR is: "+test.c);
        System.out.println("The default value of FLOAT is: "+test.f);
        System.out.println("The default value of DOUBLE is: "+test.d);
        System.out.println("The default value of SHORT is: "+test.s);
        System.out.println("The default value of LONG is: "+test.l);
        System.out.println("The default value of BOOLEAN is: "+test.b);
        System.out.println("The default value of BYTE is: "+test.by);
    }
}