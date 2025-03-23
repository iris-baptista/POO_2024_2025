package ex2;

public class Circle {
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle: [r = " + r + "]";
	}
}
