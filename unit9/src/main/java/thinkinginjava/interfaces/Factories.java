package thinkinginjava.interfaces;
import static com.elephant.util.Print.*;
/**
 *	Factory design strategy
 */
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}
class Implementationa1 implements Service{
	Implementationa1(){};

	public void method1() {
		print("Implementation1 method1.");
	}

	public void method2() {
		print("Implementation1 method2.");
	}
}
class Implementation1Factory implements ServiceFactory{
	public Service getService() {
		return new Implementationa1();
	}
}
class Implementation2 implements Service{
	public void method1() {
		print("Implementation2 method1.");
	}

	public void method2() {
		print("Implementation2 method2");
	}
}
class Implementation2Factory implements ServiceFactory{
	public Service getService() {
		return new Implementation2();
	}
}
public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s=fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args){
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
