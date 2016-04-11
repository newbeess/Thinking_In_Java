package com.elephant.io;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
/**
 * Getting channels from streams
 */
public class GetChannel {
	private static final int BSIZE=1024;
	public static void main(String[] args)throws IOException{
// Write a file
		FileChannel fc=new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
// add to the end of the file
		fc=new RandomAccessFile("data.txt","rw").getChannel();
		fc.position(fc.size()); // move to the end
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
// Read the file
		fc=new FileInputStream("data.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while (buff.hasRemaining())
			System.out.print((char)buff.get());
	}
}
