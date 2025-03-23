package ex2;

public class Student {
	private String nome;
	private int numero;
	
	public Student(String nome, int numero) {
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
		// TODO Auto-generated method stub
		return "Student: [nome = " + nome + "; numero = " + numero + "]";
	}
}
