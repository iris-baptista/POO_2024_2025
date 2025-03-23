package ex3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		funcionarios = new ArrayList<>();
	}
	
	public void add(Funcionario func) {
		funcionarios.add(func);
	}
	
	public double totalSalarios() {
		double total = 0;
		for(Funcionario fun : funcionarios)
			total = total + fun.calcularSalario();
		return total;
	}
	
	public void print() {
		for(Funcionario fun : funcionarios)
			System.out.println(fun);
	}	
}
