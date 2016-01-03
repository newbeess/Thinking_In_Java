package com.elephant.thinkinginjava;
import java.util.*;
import static com.elephant.util.Print.*;
/**
 * Final data
 */
class Value{
	int i;//Package access
	public Value(int i){this.i=i;}
}
public class FinalData {
	private static Random rand=new Random(47);
	private String id;
	public FinalData(String id){this.id=id;}

	//Can be compile-time constants
	private final int valueOne=9;
	private static final int VALUE_TWO=99;

	//Typical public constant
	public static final int VALUE_THREE=39;

	//Cannot be compile-time constants
	private final int i4=rand.nextInt(20);
	static final int INT_5=rand.nextInt(20);

	private Value v1=new Value(11);
	private final Value v2=new Value(22);
	private static final Value VAL_3=new Value(33);

	//Arrays:
	private final int[] a={1,2,3,4,5,6};
	public String toString(){
		return id+":"+"i4= "+i4+",INT_5 = "+INT_5;
	}
	public static void main(String[] args){
		FinalData fd1=new FinalData("fd1");
		//fd1.valueOne++;	//valueOne is a final basic type
		fd1.v2.i++;//v2 is a final reference.it cannot change, but its object content can
		fd1.v1=new Value(9);//v1 is a basic reference.
		for(int i=0;i<fd1.a.length;i++)
			fd1.a[i]++;	//a is a final reference,but a[i] is a changeable int type
		//fd1.v2=new Value(0);//v2 is a final reference.
		//fd1.VAL_3=new Value(1);//VAL_3 is static final reference
		//fd1.a=new int[3];// a is final reference
		print(fd1);
		print("Creating new FinalData");
		FinalData fd2=new FinalData("fd2");
		print(fd1);
		print(fd2);
	}
}
