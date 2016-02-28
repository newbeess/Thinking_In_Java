package com.elephant.exercises;
import java.io.*;
import java.util.logging.*;

class LoggingException1 extends Exception{
	private Logger logger=Logger.getLogger("LoggingException1");
	public LoggingException1(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class LoggingException2 extends Exception{
	private Logger logger=Logger.getLogger("LoggingException2");
	public LoggingException2(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Exercise6 {
	public static void main(String[] args){
		try {
			throw new LoggingException1();
		} catch (LoggingException1 e){
			System.err.println("Caught "+e);
		}
		try {
			throw new LoggingException2();
		} catch (LoggingException2 e){
			System.err.println("Caught "+e);
		}
	}
}
