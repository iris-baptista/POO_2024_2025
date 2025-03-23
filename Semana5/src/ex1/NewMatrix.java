package ex1;

public class NewMatrix {
	private int[] m;
	private int columns;
	
	//c)
	public NewMatrix(int columns) {
		for(int i =0; i < m.length; i ++) 
			for(int j = 0; j < columns ; j++) 
				this.m[i*columns + j] = 0;
		this.columns = columns;
	}
	
	public NewMatrix squareMatrix(int s) {
		return new NewMatrix(s);
	}

	public int getColumns() {
		return columns;
	}
	
	public int[] getM() {
		return m;
	}
	
	public int getElement(int l, int c) {
		return m[l* columns + c];
	}
	
	public void alter(int a, int l, int c) {
		m[l*columns + l] = a;
	}
	
	public void multiply(int e) {
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < columns; j++) 
				m[i*columns +j] = getElement(i,j) * e;
	}
	
	public boolean sameDim(NewMatrix a) {
		int dimA = a.m.length; 
		int dimB = this.m.length;
		return dimA == dimB;
	}	
}
