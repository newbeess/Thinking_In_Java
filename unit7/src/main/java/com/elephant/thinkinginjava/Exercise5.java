package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * 对于初始化顺序的理解：
 * 有继承关系的对象初始化
 * 						1.父类的静态变量->静态块 ＝＝》 子类的静态变量->静态块
 * 						2.父类的非静态变量->非静态块->构造函数
 * 						3.子类的非静态变量->非静态块->构造函数
 */
class A {

	A() {
		print("A:constructor");
	}

	static int a = calla();

	int aa = callaa();

	static {
		print("A:static block");
	}

	{
		print("A:non-static block");
	}

	static int calla() {
		print("A:static variable");
		return 1;
	}

	int callaa() {
		print("A:non-static variable");
		return 2;
	}
}
class B{
	B(){
		print("B:constructor");
	}
	static int b=callb();

	int bb=callbb();

	static {
		print("B:static block");
	}

	{
		print("B:non-static block");
	}

	static int callb(){
		print("B:static variable");
		return 1;
	}
	int callbb(){
		print(" B:non-static variable");
		return 2;
	}

}
class C extends A{
	B b=new B();
}
public class Exercise5 {
	public static void main(String[] args){
		new C();
	}
}
