package com.elephant.io;
import java.io.*;
/**
 * Created by elephant on 16/4/10.
 */
public class StoringAndRecoveringData {
	public static void main(String[] args) throws IOException{
		DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("Data.txt")));
		out.writeDouble(3.1415926);
		out.writeUTF("This is PI");
		out.writeDouble(1.41413);
		out.writeUTF("Square root of 2");
		out.close();

		DataInputStream in=new DataInputStream(
			new BufferedInputStream(
					new FileInputStream("Data.txt")));
		System.out.println(in.readDouble());
	// Only readUTF() will recover the Java-UTF String property
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());

	}
}
