package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 */
public class Burrito {
    public enum Spiciness{
        NOT,MILD,MEDIUM,HOT,FLAMING
    }
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree=degree;
    }
    public void describe(){
        System.out.print("This burrio is ");
        switch (degree){
            case NOT:   System.out.println("not spicy at all");break;
            case MILD:  System.out.println("a little hot");break;
            case MEDIUM:    System.out.println(degree);break;
            case HOT: break;
            case FLAMING: System.out.println(degree.ordinal());break;
            default:System.out.println("may be to hot!");
        }
    }
    public static void main(String[] args){
      Burrito t1=new Burrito(Spiciness.NOT);
      Burrito t2=new Burrito(Spiciness.MILD);
      Burrito t3=new Burrito(Spiciness.MEDIUM);
      Burrito t4=new Burrito(Spiciness.HOT);
      Burrito t5=new Burrito(Spiciness.FLAMING);
      t1.describe();
      t2.describe();
        t3.describe();
        t4.describe();
        t5.describe();
    }
}
