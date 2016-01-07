package thinkinginjava.polymorphism.shape;
import sun.security.provider.SHA;

import java.util.*;
/**
 * A factory that randomly creates shapes.
 */
public class RandomShapeGenerator {
	private Random rand=new Random(47);
	public Shape next(){
		switch (rand.nextInt(3)){
			default:
			case 0:	return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}
