package com.elephant.thikinginjava;

import java.util.Random;

/**
 * Created by elephant on 15/11/19.
 */
public class ForEachFloat {
    public static void main(String[] args){
        Random rand=new Random(47);
        float f[]=new float[10];
        for(int i=0;i<10;i++)
            f[i]=rand.nextFloat();
        for(float x :f)
            System.out.println(x);
    }
}
