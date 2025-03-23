package ex3;

public class Menor3 implements CriterioDeSelecao<String>{ 
	public boolean cumpreOCriterio(String elemento) {
		return elemento.length() < 3;
	}
}
