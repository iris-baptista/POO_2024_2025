package ex3;

public class Main {

	public static void main(String[] args) {
		Empresa dunderMifflin = new Empresa();
		Funcionario f1 = new Diretor("Michael Scott", 1000);
		Funcionario f2 = new Empregado("James Halpert");
		Funcionario f3 = new Empregado("Pamela Beasly");
		Funcionario f4 = new Gerente("Dwight Schrute", true);
		dunderMifflin.add(f1);
		dunderMifflin.add(f2);
		dunderMifflin.add(f3);
		dunderMifflin.add(f4);
		
		dunderMifflin.print();
		System.out.println(dunderMifflin.totalSalarios());
	}
}
