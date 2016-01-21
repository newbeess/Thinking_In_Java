package thinkinginjava.interfaces.interfaceprocessor;
import static com.elephant.util.Print.*;
/**
 *
 */

public class Apply {
	public static void process(Processor p,Object s){
		print("Using Processor "+p.name());
		print(p.process(s));
	}
}
