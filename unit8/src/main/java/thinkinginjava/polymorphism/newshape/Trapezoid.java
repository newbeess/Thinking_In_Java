package thinkinginjava.polymorphism.newshape;
import thinkinginjava.polymorphism.shape.Shape;
import static com.elephant.util.Print.*;
/**
 * new shape
 */
public class Trapezoid extends Shape{
	@Override
	public void draw() {
		print("Trapezoid.draw()");
	}

	@Override
	public void erase() {
		print("Trapezoid.erase()");
	}

	@Override
	public void print1() {
		print("Trapezoid.print1()");
	}
}
