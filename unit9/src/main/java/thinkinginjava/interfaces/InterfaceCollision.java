package thinkinginjava.interfaces;


interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}

class C{public int f(){return 1;}}

class C2 implements I1,I2{
	public void f() {}

	public int f(int i) {return 1;}
}

class C3 extends C implements I2{
	public int f(int i) {return 1;}
}

class C4 extends C implements I3{

}
//class C5 extends C implements I1{}
public class InterfaceCollision {
	public static void main(String[] args){}
}
