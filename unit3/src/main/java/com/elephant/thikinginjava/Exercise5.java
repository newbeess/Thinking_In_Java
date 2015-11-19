package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/18.
 */
class Dogs{
    String name,says;
}
public class Exercise5 {
    public static void main(String[] args){
        Dogs  dog1=new Dogs();
        dog1.name="spot";
        dog1.says="Ruff!";
        Dogs dog2=new Dogs();
        dog2.name="scruffy";
        dog2.says="Wurf!";
        System.out.println("first dog's name is: "+dog1.name+",it says: "+dog1.says);
        System.out.println("second dog's name is: "+dog2.name+",it says: "+dog2.says);
    }
}
