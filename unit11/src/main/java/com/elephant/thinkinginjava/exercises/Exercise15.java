package com.elephant.thinkinginjava.exercises;
import static com.elephant.util.Print.*;
import com.elephant.util.*;

public class Exercise15 {
	public static void main(String[] args){
		Stack<Character> stringStack=new Stack<Character>();
		String string="+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

	/**
	 * 	Use charAt() to traverse String
	 *
	 int i=-1;
		while (++i<string.length()) {
			if (string.charAt(i) == '+')
				stringStack.push(string.charAt(++i));
			else if(string.charAt(i)=='-')
				printnb(stringStack.pop());
		}
	 **/
		/**
		 * Use toCharArray() to traverse String
 		 */
	char[] data=string.toCharArray();
	for (int i=0;i<string.length();){
		switch (data[i++]){
			case '+' :
				stringStack.push(data[i++]);
				break;
			case '-' :
				printnb(stringStack.pop());
		}
	}





	}
}
