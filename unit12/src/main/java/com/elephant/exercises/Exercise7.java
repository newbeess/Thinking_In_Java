package com.elephant.exercises;
import java.io.*;
import java.util.logging.*;

public class Exercise7 {
	private static Logger logger=Logger.getLogger("ArrayIndexOutOfBounds");
	static void logException(Exception e){
		StringWriter trace=new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args){
		int[] array={1,2,3};
		try {
			array[10]=99;
		} catch (ArrayIndexOutOfBoundsException e){
			logException(e);
		}
	}
}
