package thinkinginjava.polymorphism;
import thinkinginjava.polymorphism.shape.*;
/**
 * Polymorphism in java
 * Difine a shape and gen.next() return a upcasting object
 *
 */
public class Shapes {
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String[] args){
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++)
			s[i]=gen.next();
		for(Shape shp:s){
			shp.draw();
		}
	}
}
