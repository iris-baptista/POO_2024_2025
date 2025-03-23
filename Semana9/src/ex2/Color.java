package ex2;

import java.util.InputMismatchException;

public class Color {
	public final int r, g, b;
	
	public Color(int r, int g, int b) throws InputMismatchException{
		if ( r<0 || r >255 || g<0 || g>255 || b<0 || b>255) {
			throw new IllegalArgumentException();
		} else {
			this.r = r;
			this.g = g;
			this.b = b;
		}
	}
	
	public int getR() {
		return r;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}

	public int encode(int r, int g, int b) {
		return (getR() << 16) | (getG() << 8) | getB();
	}
	
	public Color copy() {
		return new Color(getR(), getG(), getB());
	}
	
	public static void main(String[] args) {
		
	}
}