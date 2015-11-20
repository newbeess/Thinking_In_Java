package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/19.
 */
public class Exercise4 {
    public static void main(String[] args){
        for(int n=1;n<=100;n++){
            boolean flag=true;
            for (int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                System.out.println(n+", ");
        }
    }
}
