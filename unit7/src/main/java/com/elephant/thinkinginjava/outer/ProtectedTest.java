package com.elephant.thinkinginjava.outer;
import static com.elephant.util.Print.*;
/**
 * This is a class out of com.elephant.thinkinginjava,
 * Use to test protected
 */
public class ProtectedTest {
	private String name;
	private int age;
	public ProtectedTest(String name,int age){this.name=name;this.age=age;}
	protected void setName(String name){this.name=name;}
	protected void setAge(int age){this.age=age;}
	public String toString(){
		return "My name is: "+name+",and i am "+age+" years old.";
	}
}
