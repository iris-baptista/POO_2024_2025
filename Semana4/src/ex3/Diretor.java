package ex3;

public class Diretor extends Funcionario{
	private double lucro;
	
	public Diretor(String nome, double lucro) {
		super(nome);
		this.lucro = lucro;
	}
	
	public double calcularSalario() {
		double salario = 0;
		salario = lucro * 0.01;
		return salario + (800*2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Diretor: [nome = " + super.getNome() + "; lucro = " + lucro + "]";
	}
}
