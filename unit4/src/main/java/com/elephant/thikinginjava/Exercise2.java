package com.elephant.thikinginjava;

import java.util.Random;

/**
 * Created by elephant on 15/11/19.
 */
public class Exercise2 {
    public static void main(String[] args){
        Random rand=new Random(47);
        for (int i=0;i<25;i++){
            int FirstNumber=rand.nextInt();
            int SecondNumber=rand.nextInt();
            if(FirstNumber<SecondNumber)
                System.out.println("FirstNumber= "+FirstNumber+", SecondNumber= "+SecondNumber+", FirstNumber<SecondNumber");
            else if(FirstNumber>SecondNumber)
                System.out.println("FirstNumber= "+FirstNumber+", SecondNumber= "+SecondNumber+", FirstNumber>SecondNumber");
            else
                System.out.println("FirstNumber= "+FirstNumber+", SecondNumber= "+SecondNumber+", FirstNumberSecondNumber");
        }
    }
}
