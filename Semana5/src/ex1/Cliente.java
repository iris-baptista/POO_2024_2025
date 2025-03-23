package ex1;

public class Cliente {

	//b)
	static Matrix sumAndScale(Matrix a, Matrix b, int scalar) {
		if(!a.sameDim(b))
			return null;
		int l = a.getLines();
		int c = a.getColumns();
		Matrix x = new Matrix(a.getLines(), a.getColumns());
		for(int i = 0; i < l; i ++)
			for(int j = 0; j < c; j++) {
				int num = a.getElement(i, j) + a.getElement(i, j);
				x.alter(num, i, j);
			}
		x.multiply(scalar);
		return x;
	}
	
	//c)
	static NewMatrix sumAndScale(NewMatrix a, NewMatrix b, int scalar) {
		if(!a.sameDim(b))
			return null;
		int l = a.getM().length / a.getColumns();
		int c = a.getColumns();
		NewMatrix x = new NewMatrix(c);
		for(int i = 0; i < l; i ++)
			for(int j = 0; j < c; j++) {
				int num = a.getElement(i, j) + a.getElement(i, j);
				x.alter(num, i, j);
			}
		x.multiply(scalar);
		return x;
	}
}
