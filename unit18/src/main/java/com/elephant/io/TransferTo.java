package com.elephant.io;
import java.io.*;
import java.nio.channels.*;
/**
 * Using TransferTo between channels
 */
public class TransferTo {
	public static void main(String[] args) throws Exception{
		if (args.length!=2){
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel in=new FileInputStream(args[0]).getChannel(),
				out=new FileOutputStream(args[1]).getChannel();
		in.transferTo(0,in.size(),out);
	}
}
