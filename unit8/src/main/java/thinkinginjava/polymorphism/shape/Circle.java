package thinkinginjava.polymorphism.shape;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/6.
 */
public class Circle extends Shape{
	@Override
	public void draw() {
		print("Circle.draw()");
	}
	@Override
	public void erase() {
		print("Circle.erase()");
	}
	@Override
	public void print1() {print("Circle.print1()");}
}
