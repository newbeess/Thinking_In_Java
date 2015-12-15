package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/15.
 */
public class Exercise21 {
    public enum Money{
        ONE,FIVE,TEN,TWENTY,FIFTY,HUNDRED
    }
    public static void main(String[] args){
        for(Money m: Money.values())
            System.out.println(m+", ordinal: "+m.ordinal());
    }
}
