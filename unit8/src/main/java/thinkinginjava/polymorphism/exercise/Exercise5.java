package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Add method wheels to Cycle class,which return the wheels number
 * Modify ride method to call wheel method verify polymorphism
 */
public class Exercise5 {
	public static void ride(Cycle c){
		print("The wheel number is: "+c.wheel());
	}
public static void main(String[] args){
	ride(new Unicycle());
	ride(new Bicycle());
	ride(new Tricycle());
}
}
