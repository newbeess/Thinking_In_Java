package com.elephant.io;

import java.io.*;
/**
 * Create a serialized output file.
 */
public class FreezeAlien {
	public static void main(String[] args) throws IOException{
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("X.file"));
		Alien quellek=new Alien();
		out.writeObject(quellek);
	}
}
