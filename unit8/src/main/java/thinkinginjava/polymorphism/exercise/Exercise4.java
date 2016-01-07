package thinkinginjava.polymorphism.exercise;

import sun.security.provider.SHA;
import thinkinginjava.polymorphism.newshape.Trapezoid;
import thinkinginjava.polymorphism.shape.*;
/**
 * Add a new tyoe in Shapes.java
 *
 */
public class Exercise4 {
	public static void main(String[] args){
		Shape[] shapes={
				new Circle(),new Square(),new Triangle(),new Trapezoid()
		};
		for(Shape shape:shapes) {
			shape.draw();
			shape.erase();
			shape.print1();
		}
	}
}
