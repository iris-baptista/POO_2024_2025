package disciplinas;

import java.util.ArrayList;

	public class Test {
		public static void main(String[] args) {
			Aluno a1 = new Aluno(1, "Gordon Freeman");
			Aluno a2 = new Aluno(2, "Saul Goodman");
			Aluno a3 = new Aluno(3, "Walter White");

			ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
			
			Disciplina d1 = new Disciplina("Programação Orientada a Projetos", "POO", 300, inscricoes);
			d1.inscrever(a1);
			d1.inscrever(a2);
			d1.inscrever(a3);
			d1.lancarNota(20, 1);
			d1.lancarNota(20, 2);
			d1.lancarNota(20, 3);
			d1.showcase();
		}
}
