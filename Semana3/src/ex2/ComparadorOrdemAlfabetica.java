package ex2;

import java.util.Comparator;

public class ComparadorOrdemAlfabetica implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
		return comp.compare(o1.getNome(), o2.getNome());
	}

}
