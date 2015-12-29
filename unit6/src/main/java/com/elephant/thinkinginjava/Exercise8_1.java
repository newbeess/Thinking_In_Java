package com.elephant.thinkinginjava;
import static com.elephant.util.Print.*;
import access.connection2.*;

/**
 * Created by elephant on 15/12/29.
 */
public class Exercise8_1 {
	public static void main(String[] args){
		Connection[] ca=new Connection[10];
		//Use up all the Connections
		for(int i=0;i<10;i++)
			ca[i]=ConnectionManager.getConnection();
		print(ConnectionManager.getConnection());
		for (int i=0;i<5;i++){
			ca[i].checkIn();
			Connection c=ConnectionManager.getConnection();
			print(c);
			c.doSomething();
			c.checkIn();
		}
	}
}
