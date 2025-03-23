package ex3;

public class Gerente extends Funcionario{
	private boolean premio;
	
	public Gerente(String nome, boolean premio) {
		super(nome);
		this.premio = premio;
	}
	
	public double calcularSalario() {
		double salario = 0;
		if(premio)
			salario = salario + 200;
		return salario + 800;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gerente: [nome = " + super.getNome() + "; premio = " + premio + "]";
	}
}
