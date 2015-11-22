package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/22.
 * Pass this object among class
 */
class Person{
   public void eat(Apple apple){
       Apple peeled=apple.getpeeled();
       System.out.println("Yummy!");
   }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getpeeled(){
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }

}
