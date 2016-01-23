package thinkinginjava.interfaces.exercise;
import static com.elephant.util.Print.*;
import java.util.Random;

/**
 * 	Using Factory Method create a framework , coin tossing dice tossing
 */
interface TossGame{void tossing();}
interface TossGameFactory{TossGame getTossGame();}

/**
 * CoinTossing and Factory
 */
class CoinTossing implements TossGame{
	public void tossing() {
		Random rand=new Random(47);
		if (rand.nextInt(2)==1)
			print("This time-->frontage.");
		else
			print("This time-->reverse side.");
	}
}
class CoinTossingFactory implements TossGameFactory{
	public TossGame getTossGame() {
		return new CoinTossing();
	}
}


/**
 * DiceTossing and Factory
 */
class DiceTossing implements TossGame{
	public void tossing() {
		Random rand=new Random(47);
		for (int i=0;i<6;i++)
			print("The dice number is "+(rand.nextInt(6)+1));

	}
}
class DiceTossingFactory implements TossGameFactory{
	public TossGame getTossGame() {
		return new DiceTossing();
	}
}

public class Exercise19 {
	public static void startPlay(TossGameFactory x){
		TossGame toss=x.getTossGame();
		toss.tossing();
	}
	public static void main(String[] args){
		startPlay(new CoinTossingFactory());
		startPlay(new DiceTossingFactory());
	}
}
