package ex1;

public class Circle extends AbstractFigure {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI*(r*r);
	}

	public double getPerimeter() {
		return 2*Math.PI*r;
	}
	
	@Override
	public String toString() {
		return "Circle: [x = " + super.getX() + "; y = " + super.getY() + "; r = " + r + "]";
	}
}
