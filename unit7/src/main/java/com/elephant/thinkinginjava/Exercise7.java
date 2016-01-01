package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/1.
 */
class AA{
	AA(int i){
		print("AA constructor");
	}
}
class BB{
	BB(int i){
		print("BB constructor");
	}
}
class CC extends AA{
	CC(){
		super(1);
		print("CC constructor");
	}
	BB bb=new BB(2);
}

public class Exercise7 {
	public static void main(String[] args){
		new CC();
	}
}
