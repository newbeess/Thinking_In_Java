package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
/**
 * ConnectionManager has 10 Connections,
 */
import access.connection.*;

public class Exercise8 {
	public static void main(String[] args){
		Connection c=ConnectionManager.getConnection();
		while(c!=null){
			print(c);
			c.doSomething();
			c=ConnectionManager.getConnection();
		}
	}
}
