package ex2;

import java.util.ArrayList;
import java.util.Arrays;
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
		Aluno a1 = new Aluno(12, "Iris", 2010, 2005);
		Aluno a2 = new Aluno(25, "Dinis", 2015, 2010);
		
		List<Aluno> list = new ArrayList<Aluno>();
		list.add(a1);
		list.add(a2);
		
		//list.sort(new ComparadorNumeroCrescente()); //WORKING
		//list.sort(new ComparadorOrdemAlfabetica()); //WORKING
		//list.sort(new ComparadorAnoNascDecrescente()); //TO BE TESTED
		
		Aluno[] a = new Aluno[3];
		a[0] = a1;
		a[1] = a2;
		
		Arrays.sort(a , new ComparadorOrdemAlfabetica());
		//Arrays.sort(a , new ComparadorAnoNascDecrescente());
		//Arrays.sort(a, new ComparadorNumeroCrescente());
		
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i).getNome());
		
		for(int i = 0; i < a.length-1; i++)
			System.out.println(a[i].getNome());
	}
}
