package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/20.
 */
//split将四位数划分
public class Exersice10 {
    static int[] split(int n){
        int A[]=new int[4];
        A[0]=n%10;
        A[1]=n%100/10;
        A[2]=n/100%10;
        A[3]=n/1000;
        return A;
    }
//twoOrMore来判断四位数中是否有两个或者以上的0
    static boolean twoOrMore(int[] A){
        int count=0;
        for(int i=0;i<4;i++){
            if(A[i]==0)
                count++;
        }
        if(count>=2)
            return true;
        else
            return false;
    }
//isVampireNumber判断是否为吸血鬼数字
    static boolean isVampireNumber(int[] A,int n){
      boolean flag=false;
        int a,b;
        a=A[3]*10+A[2];
        b=A[1]*10+A[0];

        if(n==a*b)
            return true;
        a=A[3]*10+A[2];
        b=A[0]*10+A[1];
        if(n==a*b)
            return true;
        a=A[2]*10+A[3];
        b=A[1]*10+A[0];
        if(n==a*b)
            return true;
        a=A[2]*10+A[3];
        b=A[0]*10+A[1];
        if(n==a*b)
            return true;


        a=A[3]*10+A[1];
        b=A[2]*10+A[0];
        if(n==a*b)
            return true;

        a=A[3]*10+A[1];
        b=A[0]*10+A[2];
        if(n==a*b)
            return true;
        a=A[1]*10+A[3];
        b=A[2]*10+A[0];
        if(n==a*b)
            return true;
        a=A[1]*10+A[3];
        b=A[0]*10+A[2];
        if(n==a*b)
            return true;


        a=A[3]*10+A[0];
        b=A[2]*10+A[1];
        if(n==a*b)
            return true;
        a=A[3]*10+A[0];
        b=A[1]*10+A[2];
        if(n==a*b)
            return true;
        a=A[0]*10+A[3];
        b=A[2]*10+A[1];
        if(n==a*b)
            return true;
        a=A[0]*10+A[3];
        b=A[1]*10+A[2];
        if(n==a*b)
            return true;
        return  flag;
    }

    public static void main(String[] args){

        for (int i=1000;i<=9999;i++){

            int A[]=new int[4];
            A=split(i);
            boolean flag=false;
            if(twoOrMore(A)==true)
                continue;
            else if(isVampireNumber(A,i))
                System.out.print(i+", ");
                else
                ;
        }
    }
}
