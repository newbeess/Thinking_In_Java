package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/20.
 */
public class Exercise9 {

    static int fib(int n){
        if(n<=2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
            System.out.println(fib(i)+", ");

    }
}
