package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * 1.Vercify the action of loading class occured only one time.
 * 2.Vercidy crteating instance or call static member will cause class loading
 */
class VercifyBase{
	static int  s=1;
	int ss=s++;
	public void getS(){
		print("static int s="+s+",int ss="+ss);
	}
}
class LoadTest{
	static {
		print("Loading LoadTest");
	}
	static void staticMember(){}
}
public class Exercise23 extends VercifyBase{
	public static void main(String[] args){
		VercifyBase firstObject=new VercifyBase();
		firstObject.getS();
		VercifyBase secondObject=new VercifyBase();
		secondObject.getS();

		print("Call static member");
		LoadTest.staticMember();
		print("Creating an object");
		new LoadTest();
	}
}
