package ex2;

public class Aluno {
	private String nome;
	private int numero;
	
	public Aluno(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return this.getNome() + "(" + this.getNumero() + ")";
	}
	
	public static void main(String[] args) {
	}
}
