package com.elephant.thikinginjava;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class MathOps
{
    public static void main(String[] args){
        Random rand=new Random(47);
        int i,j,k;
        //Choose value from 1 to 100:
        j=rand.nextInt(100)+1;
        System.out.println("j= "+j);
        k=rand.nextInt(100)+1;
        System.out.println("k= "+k);
        i=j+k;
        System.out.println("j+k= "+i);
        i-=j;
        System.out.println("j-k= "+i);
        i=j/k;
        System.out.println("j/k= "+i);
        i=j%k;
        System.out.println("j%k= "+i);
        //Floating-point number tests
        float u,v,w;
        v=rand.nextFloat();
        System.out.println("v= "+v);
        w=rand.nextFloat();
        System.out.println("w= "+w);
        u=v+w;
        System.out.println("v+w= "+u);
        u=v/w;
        System.out.println("v/w= "+u);
        u=v%w;
        System.out.println("v%w= "+u);
        u /=v;
        System.out.println("u/=u:"+u);
    }
}
