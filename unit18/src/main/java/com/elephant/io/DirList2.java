package com.elephant.io;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Using anonymous inner class
 */
public class DirList2 {
	public static FilenameFilter filter(final String regex){
		return new FilenameFilter() {
			private Pattern pattern=Pattern.compile(regex);
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	}

	public static void main(String[] args){
		File path=new File(".");
		String[] list;
		if (args.length==0)
			list=path.list();
		else
			list=path.list(filter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
	}

}
