package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
public class AynamicArray {
    public static void main(String[] args){
        Other.main(new String[] {"newbie","hard work","elephant"});
    }

}

class Other{
    public static void main(String[] args){
        for(String s :args)
            System.out.print(s+" ");
    }
}