package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;

import java.nio.CharBuffer;
import java.util.*;

/**
 * Create a class produce char sequence
 */
class RandomChar{
	private static char[] capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static char[] lowers="abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] vowels="aeiou".toCharArray();
	Random rand=new Random(47);
	public char[] generate(){
		char[] buffer=new char[6];
		int idx=0;
		buffer[idx++]=lowers[rand.nextInt(lowers.length)];
		for (int i=0;i<2;i++){
			buffer[idx++]=vowels[rand.nextInt(vowels.length)];
			buffer[idx++]=capitals[rand.nextInt(capitals.length)];
		}
		buffer[idx]=' ';
		return buffer;
	}
}

public class Exercise16 extends RandomChar implements Readable {
	private int count;
	public Exercise16(int count) {this.count = count;}
	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		char[] buffer = generate();
		cb.put(buffer);
		return 10;
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(new Exercise16(10));
		while (x.hasNext())
			print(x.next());
	}
}
