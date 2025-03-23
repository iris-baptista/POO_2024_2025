package ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aluno {
	private int numero;
	private String nome;
	private int anoMatricula;
	private int anoNascimento;
	
	public Aluno(int numero, String nome, int anoMatricula, int anoNascimento) {
		this.numero = numero;
		this.nome = nome;
		this.anoMatricula = anoMatricula;
		this.anoNascimento = anoNascimento;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public int getAnoMatricula() {
		return anoMatricula;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno(22, "Iris", 2010, 2005);
		Aluno a2 = new Aluno(5, "Dinis", 2015, 2010);
		
		List<Aluno> list = new ArrayList<Aluno>();
		list.add(a1);
		list.add(a2);
		Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
		
		//list.sort((p1, p2) -> p1.getNumero() - p2.getNumero()); //WORKING
		list.sort((o1, o2) -> comp.compare(o1.getNome(), o2.getNome())); //WORKING
		
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i).getNome());
	}
}
