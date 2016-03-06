package com.elephant.strings;
import java.io.*;

public class SimpleRead {
	public static BufferedReader input=new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
	public static void main(String[] args){
		try {
			System.out.println("What is your name");
			String name= input.readLine();
			System.out.println(name);

			System.out.println("How old are you! What is your favourite double!");
			System.out.println("(input: <age><double>)");
			String numbers=input.readLine();
			System.out.println(numbers);

			String[] numArray=numbers.split(" ");
			int age=Integer.parseInt(numArray[0]);
			double favourite =Double.parseDouble(numArray[1]);
			System.out.format("Hi %s. \n", name);
			System.out.format("In 5 years you will be %d.\n",age+5);
			System.out.format("My favourite double is %f.",favourite / 2);

		} catch (IOException e){
			System.err.println("I/O exception");
		}
	}
}
