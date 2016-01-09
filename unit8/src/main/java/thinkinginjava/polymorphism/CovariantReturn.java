package thinkinginjava.polymorphism;
import static com.elephant.util.Print.*;
/**
 * Java SE5 Covariant return
 */
class Grain{
	@Override
	public String toString() {
		return "Grain";
	}
}
class Wheat extends Grain{
	@Override
	public String toString() {
		return "Wheat";
	}
}
class Mill{
	Grain process(){
		return new Grain();
	}
}
class WheatMill extends Mill{
	Wheat process() {
		return new Wheat();
	}
}
public class CovariantReturn {
	public static void main(String[] args){
		Mill m=new Mill();
		Grain g=m.process();
		print(g);
		m=new WheatMill();
		g=m.process();
		print(g);
	}
}
