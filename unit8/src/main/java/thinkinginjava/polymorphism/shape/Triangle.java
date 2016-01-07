package thinkinginjava.polymorphism.shape;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/6.
 */
public class Triangle extends Shape{
	@Override
	public void draw() {
		print("Triangle.draw()");
	}

	@Override
	public void erase() {
		print("Triangle.erase()");
	}

	@Override
	public void print1() {
		print("Triangle.print1()");
	}
}
