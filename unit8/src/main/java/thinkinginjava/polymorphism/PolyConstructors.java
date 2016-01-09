package thinkinginjava.polymorphism;
import static com.elephant.util.Print.*;
/**
 * Constructor and polymorphism,don't produce what you might except
 */
class Glyph{
	void draw(){
		print("Glyph.draw()");
	}
	Glyph(){
		print("Glyph() before draw()");
		draw();
		print("draw() after draw()");
	}

}
class RoundGlyph extends Glyph{
	private int radius=1;
	RoundGlyph(int i){
		radius=i;
		print("RoundGlyph.RoundGlyph().radis= "+radius);
	}

	@Override
	void draw() {
		print("RoundGlyph.draw().radis= "+radius);
	}
}
public class PolyConstructors extends Glyph{
	public static void main(String[] args){
		new RoundGlyph(5);
	}
}
