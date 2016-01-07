package thinkinginjava.polymorphism.exercise;
import thinkinginjava.polymorphism.shape.*;
/**
 * Add a new method in Shape.java,use this method print a message
 * 1.Subclass not override the method.
 * 2.override print1() in one subclass
 * 3.override print1() in all subclasses
 *
 */
public class Exercise3 {
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String[] args){
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++)
			s[i]=gen.next();
		for(Shape shp:s){
			shp.print1();
		}
	}
}
