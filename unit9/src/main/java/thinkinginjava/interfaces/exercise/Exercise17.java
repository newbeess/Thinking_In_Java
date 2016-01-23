package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
import thinkinginjava.interfaces.Months;

/**
 * 	verify the fields in the interface is implicitly static and final
 */

public class Exercise17 implements Months {
	public static void main(String[] args){
		Exercise17 x=new Exercise17();
		Exercise17 y=new Exercise17();

		//final
		//!x.JANUARY=2;

		//static
		print(Months.DECMBER);
	}
}
