package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/18.
 */

public class Exercise6 {
    public static void main(String[] args){
        Integer n1=new Integer(2);
        Integer n2=new Integer(2);
        Dogs dog1=new Dogs();
        Dogs dog2=new Dogs();
        Dogs dog3=new Dogs();
        dog1.name="spot";
        dog1.says="Ruff!";
        dog2.name="scruffy";
        dog2.says="Wurf!";
        dog3=dog1;
        System.out.println("use equals test dog1 and dog2: "+dog1.equals(dog2));
        System.out.println("use equals test dog1 and dog3: "+dog1.equals(dog3));
        System.out.println("use equals test dog2 and dog3: "+dog2.equals(dog3));
        System.out.print("use == test dog1 and dog2: ");
        System.out.println(dog1 == dog2);
        System.out.print("use == test dog1 and dog3: ");
        System.out.println(dog1==dog3);
        System.out.print("use == test dog2 and dog3: ");
        System.out.println(dog3==dog2);


    }
}
