package thinkinginjava.polymorphism.exercise;
import static com.elephant.util.Print.*;
/**
 * Add a RectangularGlyph to PolyConstructors.java
 * Demonstrate the problem described in this section
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
class RectangularGlyph extends Glyph{
	private int width=4;
	private int height=5;
	RectangularGlyph(int weight,int height){
		this.width=weight;
		this.height=height;
		print("RecangularGlyph.RectangularGlyph().width= "+width+",height="+height);

	}
	void draw(){
		print("RectangularGlyph.draw().area="+width*height);
	}
}
public class Exercise15 {
	public static void main(String[] args){
		new RectangularGlyph(2,2).draw();
	}
}
