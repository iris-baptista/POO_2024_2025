package ex3;

public class Contains implements CriterioDeSelecao<String>{
	public boolean cumpreOCriterio(String elemento) {
		return elemento.startsWith("i");
	}
}
