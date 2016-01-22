package thinkinginjava.interfaces.exercise;

/**
 * Modify exercise14
 * Create an abstract class and inherit by a subclass
 */
abstract class Abstract{
	String s;
	abstract void abf();
}
class All extends Abstract implements Interface4{
	void abf() {}
	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
	public void g1() {}
	public void g2() {}
	public void g3() {}
}
public class Exercsie15 {
	static void take1(Interface1 i){
		i.f1();
		i.g1();
	}
	static void take2(Interface2 i){
		i.f2();
		i.g2();
	}
	static void take3(Interface3 i){
		i.f3();
		i.g3();
	}
	static void take4(Interface4 i){
		i.f4();
	}
	static void takeAbstract(Abstract i){
		i.abf();
	}
	public static void main(String[] args){
		All x=new All();
		take1(x);
		take2(x);
		take3(x);
		take4(x);
		takeAbstract(x);
	}
}
