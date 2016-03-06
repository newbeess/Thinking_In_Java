package com.elephant.strings;
import java.util.regex.*;
import com.elephant.util.*;
import static com.elephant.util.Print.*;

		/*! Here's a block of text to useas input to the regular expression matcher.Note that we'll first extract the block of the text
			by looking for the special delimiters,then process the extracted block.

		 */
public class TheReplacements {
	public static void main(String[] args) throws Exception{
		String s = TextFile.read("src/main/java/com/elephant/strings/TheReplacements.java");
		// Match the specially commented block of text above:
		Matcher mInput=Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
		if (mInput.find())
			s= mInput.group(1); // Captured by parentheses
		// Replace two or more spaces at the begining of each line with no spaces. Must enable MULTILINE mode:
		s=s.replace("(?m)^+","");
		print(s);
		s=s.replaceFirst("[aeiou]]","(VOWEL1)");
		StringBuffer sbuf=new StringBuffer();
		Pattern p=Pattern.compile("[aeiou]");
		Matcher m=p.matcher(s);
		// Process the find information as you perform the replacements:
		while (m.find())
			m.appendReplacement(sbuf,m.group().toUpperCase());
		// Put in the remainder of the text:
		m.appendTail(sbuf);
		print(sbuf);
	}
}
