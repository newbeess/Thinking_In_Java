package thinkinginjava.polymorphism.shape;
import static com.elephant.util.Print.*;
/**
 * Created by elephant on 16/1/6.
 */
public class Square extends Shape{
	@Override
	public void draw() {
		print("Square.draw()");
	}

	@Override
	public void erase() {
		print("Square.erase()");
	}

	@Override
	public void print1() {
		print("Square.print1()");
	}
}
