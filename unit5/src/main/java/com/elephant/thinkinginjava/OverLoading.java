package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * Test function overloading
 */

class Tree{
    int height;
    Tree(){
        System.out.println("我是小树苗，高度为0");
        height=0;
    }
    Tree(int i){
        System.out.println("我已经长高了，我的高度为：" +i);
        height=i;
    }
    void info(){
        System.out.println("我的高度是："+height);
    }
    void info(String s){
        System.out.println(s+":我的告诉是"+height);
    }
}


public class OverLoading {
    public static void main(String[] args) {
         Tree tree1=new Tree();
         Tree tree2=new Tree(7);
         tree1.info();
         tree1.info("OverLoading info");
         tree2.info();
         tree2.info("OverLoading info");
    }
}
