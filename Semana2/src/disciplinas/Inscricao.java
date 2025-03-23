package disciplinas;

public class Inscricao {
	private int nota;
	private Aluno aluno;
	public static final int NA = -1;
	
	public Inscricao(int n, Aluno a) {
		this.nota = n;
		this.aluno = a;
	}
	
	public boolean temNota(){
		return nota != NA;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int value) {
		nota = value;
	}
	
	public Aluno getAluno() {
		return aluno;
	}	
}