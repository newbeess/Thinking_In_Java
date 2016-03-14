package com.elephant.exercises;
import static com.elephant.util.Print.*;
public class Exercise2<T> {
	private T a;
	private T b;
	private T c;
	public Exercise2(T a,T b,T c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void setA(T a){this.a=a;}
	public void setB(T b){this.b=b;}
	public void setC(T c){this.c=c;}
	public T getA(){return a;}
	public T getB(){return b;}
	public T getC(){return c;}

	public static void main(String[] args){
		Exercise2<String> x=new Exercise2("A","B","C");
		print(x.getA());
		print(x.getB());
		print(x.getC());
		x.setA("E");
		print(x.getA());
	}

}
