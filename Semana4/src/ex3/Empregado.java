package ex3;

public class Empregado extends Funcionario{
	public Empregado(String nome) {
		super(nome);
	}
	
	public double calcularSalario() {
		return 800;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
