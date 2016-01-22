package thinkinginjava.interfaces;
import static com.elephant.util.Print.*;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 *	Create an adapter with inheritance
 */

public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
	private int count;
	public AdaptedRandomDoubles(int count){this.count=count;}
	public int read(CharBuffer cb){
		if (count--==0)
			return -1;
		String result=Double.toHexString(next())+" ";
		cb.append(result);
		return result.length();
	}
	public static void main(String[] args){
		Scanner s=new Scanner(new AdaptedRandomDoubles(10));
		while (s.hasNextDouble())
			print(s.nextDouble()+" ");
	}
}
