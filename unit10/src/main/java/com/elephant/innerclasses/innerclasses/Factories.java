package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/2/4.
 */
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getService();
}
class Implementation1 implements Service{
	private Implementation1(){}
	public void method1() {
		print("Implementation1.method1()");
	}
	public void method2() {
		print("Implementation1.method2()");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		public Service getService() {
			return new Implementation1();
		}
	};
}
class Implementation2 implements Service{
	private Implementation2(){}
	public void method1() {
		print("Implementation2.method1()");
	}
	public void method2() {
		print("Implementaiton2.method2()");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		public Service getService() {
			return new Implementation2();
		}
	};
}
public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s=fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args){
		serviceConsumer(Implementation1.factory);
		//	Implementation are completely interchangeable:
		serviceConsumer(Implementation2.factory);
	}
}
