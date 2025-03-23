package ex2;

import java.util.Comparator;

public class ComparadorAnoNascDecrescente implements Comparator<Aluno>{
	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		int cmp = o2.getAnoNascimento() - o1.getAnoNascimento();
		if(cmp == 0) {
			int cmp2 = o2.getAnoMatricula() - o1.getAnoMatricula();
			if(cmp2 == 0) {
				Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
				return comp.compare(o1.getNome(), o2.getNome());
			} else {
				return cmp2;
			}
		}
		return cmp;
	}
}
