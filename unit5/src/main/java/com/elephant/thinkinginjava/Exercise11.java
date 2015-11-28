package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/28.
 */

public class Exercise11 {
    public static void main(String[] args){
        QQ mycount=new QQ(true);
        QQ yours=new QQ(false);
        QQ his=new QQ(true);
        mycount.Logout();
        yours.Login();
        his.Login();
        System.gc();
        System.runFinalization();
    }
}