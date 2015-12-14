package com.elephant.thinkinginjava;

import java.util.Random;

/**
 * Created by elephant on 15/12/14.
 */
public class ArraryClassObj {
    public static void main(String[] args){
        Random rand=new Random(4);//随机数生成器rand，种子为47
        Integer[] a=new Integer[rand.nextInt(20)];//生成0-19的int类型
        System.out.println("a.length= " + a.length);
        for(int i=0;i<a.length;i++)
            System.out.print("a["+i+"]="+a[i]+";");
        for(int i=0;i<a.length;i++){
            a[i]= rand.nextInt(100);
            System.out.print("a["+i+"]="+a[i]+";");
        }

    }
}
