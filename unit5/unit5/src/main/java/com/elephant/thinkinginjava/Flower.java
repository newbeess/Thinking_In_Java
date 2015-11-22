package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 */
public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        System.out.println("Constructor with int petals,petalCount="+petalCount);
    }
    Flower(String ss){
        s=ss;
        System.out.println("Constructor with String ss,s="+s);
    }
    Flower(String ss,int petals){
        this(ss);
     //this(petals);//this可以调用构造函数，但是不能同时调用两个
        this.petalCount=petals;
        System.out.println("Constructor with String ss and int petals,");
    }
    Flower(){
        this("hi",7);
        System.out.println("Constructor with no paramters");
    }
    void printPetalCount(){
       // this(22);//this 只能在构造函数中使用this，调用其他构造函数。
        System.out.println("peltalsCount="+petalCount+",s="+s);
    }
    public static void main(String[] args){
        Flower flower=new Flower();
        flower.printPetalCount();
    }
}
