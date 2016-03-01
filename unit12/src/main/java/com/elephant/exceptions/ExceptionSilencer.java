package com.elephant.exceptions;


public class ExceptionSilencer {
	public static void main(String[] args){
		try {
			throw new RuntimeException();
		} finally {
			// Using 'return' inside the finally block will silence an thrown exception.
			return;
		}
	}
}
