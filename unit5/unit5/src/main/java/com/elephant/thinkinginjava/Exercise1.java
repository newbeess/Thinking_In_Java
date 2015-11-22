package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 */

class InitialStringIsNull{
    String s;
    void p(){
        System.out.println("Initial String is:"+s+".");
    }
}

public class Exercise1 {
    public static void main(String[] args){
        InitialStringIsNull Is=new InitialStringIsNull();
        Is.p();
    }
}
