package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/11/28.
 */
class QQ{
    boolean status; //initialize is false.
    QQ(boolean s){
        status=s;
    }
    void Login(){
        status=true;
    }
    void Logout(){
        status=false;
    }
    protected void finalize(){
     if(status)
         System.out.println("Some counts still login!");
    }
}

public class Exercise10 {
    public static void main(String[] args){
        QQ mycount=new QQ(true);
        QQ yours=new QQ(false);
        QQ his=new QQ(true);
        mycount.Logout();
        yours.Login();
        his.Login();
        System.gc();
    }
}
