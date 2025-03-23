package ex3;

public abstract class Funcionario {
	private String nome;
		
	public Funcionario(String nome) {
		this.nome = nome;
	}
		
	public String getNome() {
		return nome;
	}
		
	public abstract double calcularSalario();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Funcionario: [nome = " + nome + "]";
	}
}
