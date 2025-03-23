package ex1;

public class Rectangle extends AbstractFigure{
	private int height;
	private int width;
	
	public Rectangle(int x, int y, int height, int width) {
		super(x,y);
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*height + 2*width;
	}
	
	public String toString() {
		return "Rectangle: [x = " + super.getX() + "; y = " + super.getY() + "; height = " + height + "; width = " + width + "]";
	}
}
