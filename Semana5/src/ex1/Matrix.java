package ex1;

public class Matrix {
	private int[][] m;
	
	//a)
	//1)
	public Matrix(int lines, int columns) {
		this.m = new int[lines][columns];
	}
	
	//2)
	public Matrix(int s) {
		this.m = new int[s][s];
	}

	//3)
	public int getLines() {
		return m.length;
	}

	public int getColumns() {
		return m[0].length;
	}
	
	//4)
	public int getElement(int l, int c) {
		return m[l][c];
	}
	
	public void alter(int a, int l, int c) {
		m[l][c] = a;
	}
	
	//5)
	public void multiply(int e) {
		for(int i = 0; i < getLines(); i++)
			for(int j = 0; j < getColumns(); j++) 
				m[i][j] = getElement(i,j) * e;
	}
	
	//6)
	public boolean sameDim(Matrix a) {
		int dimA = a.getColumns()*a.getLines();
		int dimB = this.getColumns()*this.getLines();
		return dimA == dimB;
	}	
}
