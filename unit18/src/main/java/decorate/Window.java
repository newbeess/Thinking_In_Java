package decorate;

// The Window interface class
public interface Window {
	public void draw(); // Draws the Window
	public String getDescription(); // Returns a description of the Window
}

// Extension of a simple Window without any scrollbars
class SimpleWindow implements Window {
	public void draw() {
		// Draw window
	}

	public String getDescription() {
		return "simple window";
	}
}

// abstract decorator class - note that it implements Window
abstract class WindowDecorator implements Window {
	protected Window windowToBeDecorated; // the Window being decorated

	public WindowDecorator (Window windowToBeDecorated) {
		this.windowToBeDecorated = windowToBeDecorated;
	}
	public void draw() {
		windowToBeDecorated.draw(); //Delegation
	}
	public String getDescription() {
		return windowToBeDecorated.getDescription(); //Delegation
	}
}

// The first concrete decorator which adds vertical scrollbar functionality
class VerticalScrollBarDecorator extends WindowDecorator {
	public VerticalScrollBarDecorator (Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}

	private void drawVerticalScrollBar() {
		// Draw the vertical scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}
}

// The second concrete decorator which adds horizontal scrollbar functionality
class HorizontalScrollBarDecorator extends WindowDecorator {
	public HorizontalScrollBarDecorator (Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	private void drawHorizontalScrollBar() {
		// Draw the horizontal scrollbar
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
}