package com.elephant.strings;
import java.util.regex.*;
import static com.elephant.util.Print.*;

public class Finding {
	public static void main(String[] args){
		Matcher m=Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while (m.find())
			printnb(m.group()+" ");
		print();
		int i=0;
		while (m.find(i)){
			printnb(m.group()+" ");
			i++;
		}
	}
}
