package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/28.
 */

class Book{
    boolean checkedOut=false;
    Book(boolean checkOut){
        checkedOut=checkOut;
    }
    void checkedIn(){
        checkedOut=false;
    }
    protected void finalize(){
        if(checkedOut)
            System.out.println("ERROR:checked out!");
    }
}

public class TerminationCondition {
    public static void main(String[] args){
        Book novel=new Book(true);
        novel.checkedIn();
        new Book(true);
        System.gc();
    }
}
