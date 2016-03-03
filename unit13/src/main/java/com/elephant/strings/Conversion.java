package com.elephant.strings;
import java.math.*;
import java.util.*;

public class Conversion {
	public static void main(String[] args){
		Formatter f=new Formatter(System.out);

		// char
		char u='a';
		System.out.println("u='a'");
		f.format("s: %s\n",u);
		f.format("c: %c\n",u);
		f.format("b: %b\n",u);
		//f.format("f: %f\n",u);
		//f.format("e: %e\n",u);
		//f.format("x: %x\n",u);
		f.format("h: %h\n",u);

		// int
		int v=121;
		System.out.println("v=121");
		f.format("s: %s\n",v);
		f.format("c: %c\n",v);
		f.format("b: %b\n",v);
		//f.format("f: %f\n",v);
		//f.format("e: %e\n",v);
		f.format("x: %x\n",v);
		f.format("h: %h\n",v);

		// BigInteger
		BigInteger w=new BigInteger("50000000000000000");
		System.out.println("w = new BigInteger(\"50000000000000000\")");
		f.format("s: %s\n",w);
		//f.format("c: %c\n",w);
		f.format("b: %b\n",w);
		//f.format("f: %f\n",w);
		//f.format("e: %e\n",w);
		f.format("x: %x\n",w);
		f.format("h: %h\n",w);

		// double
		double x=179.543;
		System.out.println("x = 179.543");
		f.format("s: %s\n",x);
		//f.format("c: %c\n",x);
		f.format("b: %b\n",x);
		f.format("f: %f\n",x);
		f.format("e: %e\n",x);
		//f.format("x: %x\n",x);
		f.format("h: %h\n",x);

		// Conversion
		Conversion y=new Conversion();
		System.out.println("y = new Conversion()");
		f.format("s: %s\n",y);
		//f.format("c: %c\n",y);
		f.format("b: %b\n",y);
		//f.format("f: %f\n",y);
		//f.format("e: %e\n",y);
		//f.format("x: %x\n",y);
		f.format("h: %h\n",y);
	}
}
