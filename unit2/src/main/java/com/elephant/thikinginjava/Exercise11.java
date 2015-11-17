package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/17.
 */
public class Exercise11 {
    int anIntegerRepresentingColors;
    void changeTheHueOfColors(int newHue){
        anIntegerRepresentingColors=newHue;
    }
    public static void main(String[] args){
        Exercise11 exercise11=new Exercise11();
        exercise11.changeTheHueOfColors(27);
    }
}
