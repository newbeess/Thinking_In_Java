package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/16.
 */
//: object/ShowProperties.java
public class ShowProperties {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("java.vm.name"));
    }
}
///:~end