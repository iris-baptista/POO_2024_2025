package ex1;

public class Teste {

	public static void main(String[] args) {
		
		Matrix m1 = new Matrix(2,3);
		m1.alter(0, 0, 1);
		m1.alter(0, 1, 2);
		m1.alter(0, 2, 3);
		m1.alter(1, 0, 4);
		m1.alter(1, 1, 5);
		m1.alter(1, 2, 6);
		
		Matrix m2 = new Matrix(2,3);
		m2.alter(0, 0, 1);
		m2.alter(0, 1, 2);
		m2.alter(0, 2, 3);
		m2.alter(1, 0, 3);
		m2.alter(1, 1, 2);
		m2.alter(1, 2, 1);
		
		Matrix m3 = new Matrix(2);
		m3.alter(0, 0, 1);
		m3.alter(1, 1, 1);
			
		Matrix m4 = sumAndScale(m1, m2, 2);
		
		System.out.println(m1);   // 1 2 3
							      // 4 5 6
		
		System.out.println(m2);   // 1 2 3 
		                          // 3 2 1
		
		System.out.println(m3);   // 1 0 
        						  // 0 1 

		System.out.println(m4);   // 4  8 12 
		                          // 14 14 14 
	}

	// Exerc. 5.1-b)
	static Matrix sumAndScale(Matrix a, Matrix b, int scalar) {
		// TODO 		
		return null;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
