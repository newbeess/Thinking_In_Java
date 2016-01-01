package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/1.
 */

class Art{
	Art(){
		print("Art constructor");
	}
}
class Drawing extends Art{
	Drawing(){
		print("Drawing constructor");
	}
}
public class Cartoon extends Drawing{
	public Cartoon(){
		print("Cartoon constructor");
	}
	public static void main(String[] args){
		Cartoon x=new Cartoon();
	}
}
