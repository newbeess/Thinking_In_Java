package com.elephant.innerclasses.innerclasses;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/2/6.
 */
public interface ClassInInterface {
	void hello();
	class Test implements ClassInInterface{
		public void hello() {
			print("hellp");
		}
		public static void main(String[] args){
			new Test().hello();
		}
	}

}
