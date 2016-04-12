package com.elephant.io.xfiles;

import java.io.*;
/**
 * Try to recover a serialized file without the class of object that's storted in that file
 */
public class ThawAlien {
	public static void main(String[] args) throws IOException{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File("..","X.file")));
		Object mystery=in.readObject();
		System.out.println(mystery.getClass());
	}
}
