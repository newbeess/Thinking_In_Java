package thinkinginjava.interfaces;
import static com.elephant.util.Print.*;
/**
 * random double
 */
import java.util.*;

public class RandomDoubles {
	private static Random rand=new Random(47);
	private double next(){return rand.nextDouble();}
	public static void main(String[] args){
		RandomDoubles rd=new RandomDoubles();
		for (int i=0;i<7;i++)
			print(rd.next()+" ");
	}
}
