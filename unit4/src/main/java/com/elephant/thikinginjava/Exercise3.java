package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/19.
 */
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args){
        Random rand=new Random(47);
        while(true){
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
