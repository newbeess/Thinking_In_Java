package com.elephant.exceptions;
import java.io.*;
import static com.elephant.util.Print.*;

/**
 * "Turning off" the Checked exceptions.
 */

class WrapCheckedException{
	void throwRuntimeException(int type){
		try {
			switch (type){
				case 0: throw new FileNotFoundException();
				case 1: throw new IOException();
				case 2: throw new RuntimeException("Where am I?");
				default: return;
			}
		} catch (Exception e){
			// Adapt to unckecked:
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception{}

public class TurnOffChecking {
	public static void main(String[] args){
		WrapCheckedException wce=new WrapCheckedException();
		// You can call throwRuntimeException() without a try block,
		// and left RuntimeExceptions leave the method
		wce.throwRuntimeException(3);
		// Or you can choose to catch exceptions:
		for (int i=0;i<4;i++)
			try {
				if (i<3)
					wce.throwRuntimeException(i);
				else
					throw new SomeOtherException();
			} catch (SomeOtherException e){
				System.out.println("SomeOtherException: "+e);
			} catch (RuntimeException re){
				try {
					throw re.getCause();
				} catch (FileNotFoundException e){
					print("FileNotFoundException: "+e);
				} catch (IOException e){
					print("IOException: "+e);
				} catch (Throwable e){
					print("Throwable: "+e);
				}
			}
	}
}
