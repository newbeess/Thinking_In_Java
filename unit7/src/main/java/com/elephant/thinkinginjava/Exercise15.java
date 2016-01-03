package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
import com.elephant.thinkinginjava.outer.ProtectedTest;

/**
 * inherit from com.elephant.thinkinginjava.outer.ProtectedTest
 * Test for protected
 */
 enum Sex{
		boy,girl
		}
public class Exercise15 extends ProtectedTest{

	private Sex sex;
	Exercise15(String name,int age,Sex sex){
		super(name,age);
		this.sex=sex;
	}
	public String toString(){
		return super.toString()+",i am a "+sex;
	}
	public static void main(String[] args){
		ProtectedTest test=new ProtectedTest("outer",1);
		print(test);
		Exercise15 x=new Exercise15("elephant",18,Sex.boy);
		print(x);
		x.setAge(24);
		x.setName("newbeess");
		print(x);
	}
}
