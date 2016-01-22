package thinkinginjava.interfaces.exercise;

/**
 * 	Create three interfaces, each interface include two methods.
 * 	Then one interface inherit the above interfaces,and add a new method.
 * 	Create a class implements this interface and extends an instance class.
 * 	Write four mehtods, according to  four type interfaces.
 */
interface Interface1{
	void f1();
	void g1();
}
interface Interface2{
	void f2();
	void g2();
}
interface Interface3{
	void f3();
	void g3();
}

interface Interface4 extends Interface1,Interface2,Interface3{
	void f4();
}
class A{
	void a(){}
}
class Instance extends A implements Interface4{

	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
	public void g1() {}
	public void g2() {}
	public void g3() {}
}

public class Exercise14 {
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
	public static void main(String[] args){
		Instance x=new Instance();
		take1(x);
		take2(x);
		take3(x);
		take4(x);
	}
}
