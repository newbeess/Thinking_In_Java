package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
public class Exercise16 {
    public static void main(String[] args){
        String[] s=new String[4];
        s[0]="There";
        s[1]="are";
        s[2]="some";
        s[3]="Strings";
        String[] s1={"There","are","other","Strings"};
        for (int i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
        System.out.println();
        for (int i=0;i<s1.length;i++)
            System.out.print(s1[i]+" ");
    }
}
