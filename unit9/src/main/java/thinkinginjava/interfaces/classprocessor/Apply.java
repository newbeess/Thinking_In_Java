package thinkinginjava.interfaces.classprocessor;

/**
 *	Decouple completely
 */
import java.util.*;
import static com.elephant.util.Print.*;

/**
 *
 */
class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){return input;}
}

/**
 *
 */
class Upcase extends Processor{
	String process(Object input){
		//Covariant return
		return ((String)input).toUpperCase();
	}
}

/**
 *
 */
class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

/**
 *
 */
class Splitter extends Processor{
	String process(Object input){
		//The split() argument divides a String into pieces
		return Arrays.toString(((String)input).split(" ",0));
	}
}

/**
 *
 */
public class Apply {
	public static void process(Processor p,Object s){
		print("Using Processor "+p.name());
		print(p.process(s));
	}
	public static String s="Disagreement with briefs is by defination incorrect ";
	public static void main(String[] args){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}
}
