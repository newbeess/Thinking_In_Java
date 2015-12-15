package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/15.
 */
public class Exercise22 {
	Exercise21.Money money;

	public Exercise22(Exercise21.Money money){
		this.money=money;
	}
    public void aswitch(){
        switch(money){
            case ONE:   System.out.println("It's one RMB");break;
            case FIVE:  System.out.println("It's five RMB");break;
			case TEN:	System.out.println("It's ten RMB");break;
			case TWENTY: System.out.println("It's twenty RMB");break;
			case FIFTY:	System.out.println("It's fifty RMB");break;
			case HUNDRED:System.out.println("It's hundred RMB");break;
			default: System.out.println("It's wrong!");
        }
    }
    public static void main(String[] args){
		Exercise22 t1=new Exercise22(Exercise21.Money.ONE);
		Exercise22 t2=new Exercise22(Exercise21.Money.FIVE);
		Exercise22 t3=new Exercise22(Exercise21.Money.TWENTY);
		Exercise22 t4=new Exercise22(Exercise21.Money.FIFTY);
		Exercise22 t5=new Exercise22(Exercise21.Money.HUNDRED);
		t1.aswitch();
		t2.aswitch();
		t3.aswitch();
		t4.aswitch();
		t5.aswitch();



	}
}
