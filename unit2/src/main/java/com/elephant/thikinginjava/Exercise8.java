package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/17.
 */

class TestCase{
    int i=10;
    static int StaticI=100;
    void VhangeChange(){
        i++;
        StaticI++;
    }
}

public class Exercise8 {
    public static void main(String[] args){
        TestCase T1=new TestCase();
        System.out.println("T1 dynamic INT value of i is: "+T1.i);
        System.out.println("T1 static INT value of StaticI is: "+T1.StaticI);
        T1.VhangeChange();
        System.out.println("T1 dynamic INT value of i is: "+T1.i);
        System.out.println("T1 static INT value of StaticI is: "+T1.StaticI);
        T1.VhangeChange();
        TestCase T2=new TestCase();
        System.out.println("T2 dynamic INT value of i is: "+T2.i);
        System.out.println("T2 static INT value of StaticI is: "+T2.StaticI);
        T2.VhangeChange();
        System.out.println("T2 dynamic INT value of i is: "+T2.i);
        System.out.println("T2 static INT value of StaticI is: "+T2.StaticI);
    }
}
