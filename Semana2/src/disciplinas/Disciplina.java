package disciplinas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
	private String nome;
	private String sigla;
	private int capacidade;
	private ArrayList<Inscricao> inscricoes;
	
	public static final int NA = -1;
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public Disciplina(String nome, String sigla, int capacidade, ArrayList<Inscricao> inscricoes) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
		this.inscricoes = inscricoes;
	}
	
	// 2.1
	private Inscricao getInscricao(int nr_aluno) {
		for(int i = 0; i < inscricoes.size(); i++) {
			if (inscricoes.get(i).getAluno().getNumero() == nr_aluno) 
				return inscricoes.get(i);
		}
		return null;
	}	

	public void inscrever(Aluno aluno) { //COMPLETED AND WORKING (TESTED)
		if(capacidade > 0) {
			inscricoes.add(new Inscricao(-1, aluno));
			capacidade--;
		}
	}
	
	public void desinscrever(int nr_aluno) {	//COMPLETED AND WORKING (TESTED)
		Inscricao test = getInscricao(nr_aluno);
		if(test != null) {
			capacidade++;
			inscricoes.remove(test);
		}
	}
	
	public void lancarNota(int nota, int nr_aluno) { //COMPLETED AND WORKING (TESTED)
		if(nota <= 20 && nota >= 0) {
			Inscricao test = getInscricao(nr_aluno);
			int index = getIndex(nr_aluno);
			if(test != null && index != -1) { 
				test.setNota(nota);
				inscricoes.set(index, test);
			}
		}
	}
	
	private int getIndex(int nr_aluno) {
		for(int i = 0; i < inscricoes.size(); i++) {
			if (inscricoes.get(i).getAluno().getNumero() == nr_aluno) 
				return i;
		}
		return -1;
	}
	
	public boolean temNota(int nr_aluno) {	//COMPLETED AND WORKING (TESTED)
		Inscricao test = getInscricao(nr_aluno);
		if(test == null) 
			return false;
		return test.getNota() != -1;	
		
	}
	
	public int obterNota(int nr_aluno) { //COMPLETED AND WORKING (TESTED)
		Inscricao test = getInscricao(nr_aluno);
		if(test == null)
			return -1;
		else
			return test.getNota();
	}
	
	public void showcase() {	//COMPLETED AND WORKING (TESTED)
		System.out.println(nome + " - " + sigla);
		System.out.println(capacidade);
		for(int i = 0; i < inscricoes.size(); i++) {
			Inscricao ins = inscricoes.get(i);
			Aluno a = inscricoes.get(i).getAluno();
			if(ins.getNota() == -1)
				System.out.println(a.getNumero() + " NA");
			else
				System.out.println(a.getNumero() + " " + ins.getNota());
		}
	}
	
	public double notaMedia() { //COMPLETED AND WORKING (TESTED)
		double nota = 0;
		for(int i = 0; i < inscricoes.size(); i++) {
			Inscricao test = inscricoes.get(i);
			if(test.getNota() != -1)
				nota = nota + test.getNota();
		}
		double media = nota / inscricoes.size();
		return media;
	}
	
	public ArrayList<Aluno> melhoresAlunos(){ 	// NOT COMPLETED NOR TESTED
		ArrayList<Aluno> aList = new ArrayList<Aluno>();
		for(int i = 0; i < inscricoes.size(); i++) {
			Inscricao test = inscricoes.get(i);
			int grade = 0;
			Aluno al = test.getAluno();
			if(test.getNota() > grade) {
				grade = test.getNota();
				aList.clear();
				aList.add(al);
			} else if(test.getNota() == grade) {
				aList.add(al);
			}
		}
		return aList;
	}
	
	//2.3
	public static Disciplina createDisciplina(String name, int cap, ArrayList<Aluno> aList) { // COMPLETED AND WORKING (TESTED)
		cap = cap - aList.size();
		ArrayList<Inscricao> iList = new ArrayList<Inscricao>();
		for(int i = 0; i < aList.size(); i++) {
			iList.add(new Inscricao(-1, aList.get(i)));
		}
		Disciplina d = new Disciplina(name, sigla(name), cap, iList);
		return d;
	}
	
	private static String sigla(String name) { //COMPLETED AND WORKING (TESTED)
		String sig = "";
		String[] st = name.split(" ");
		for(int i = 0; i < st.length; i++) {
			if(Character.isUpperCase(st[i].charAt(0))) {
				sig = sig + st[i].charAt(0);
			}
		}
		return sig;
	}
	
	// 2.4
	public void toFile(String fileName) { //COMPLETED AND WORKING (TESTED)
		try {
			PrintWriter writer = new PrintWriter(new File(fileName));
			
			writer.println(this.getNome());
			writer.println(this.getCapacidade());
			
			for(int i = 0; i < this.inscricoes.size(); i++) {
				Inscricao ins = this.inscricoes.get(i);
				Aluno a = this.inscricoes.get(i).getAluno();
				if(ins.temNota())
					writer.println(a.getNumero() + " " + ins.getNota());
				else
					writer.println(a.getNumero() + " NA");
			}
			writer.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Problema a escrever no ficheiro");
		}
	}
	
	// 2.5
	public static Disciplina createDisciplinaFile(String aListFile, String disciplinaFile) { //COMPLETED AND WORKING (TESTED)
		ArrayList<Aluno> al = Aluno.list(aListFile);
		String name = "";
		int cap = 0;
		try {
			Scanner scanner = new Scanner(new File(disciplinaFile));
			
			name = scanner.nextLine();
			cap = scanner.nextInt();
			
			scanner.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Erro a criar ficheiro");
		}
		
		Disciplina dis = createDisciplina(name, cap, al);
		
		return dis;
	}
	
	public void toPrint() {
		System.out.println(this.nome);
		System.out.println(this.capacidade);
		for(int i = 0; i < inscricoes.size(); i++) {
			Inscricao test = inscricoes.get(i);
			System.out.println(test.getAluno().getNome() + " - " + test.getNota());
		}
		
	}
	
	public static void main(String[] args) {
		//ArrayList<Inscricao> iList = new ArrayList<Inscricao>();
		ArrayList<Aluno> aList = new ArrayList<Aluno>();
		
		//Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO", 20, iList);
		Aluno a = new Aluno(123, "Iris Baptista");
		Aluno b = new Aluno(124, "Joao Fe");
		Aluno c = new Aluno(125, "Edo");
		aList.add(a);
		aList.add(b);
		aList.add(c);
		Disciplina bd = createDisciplina("Base de Dados", 200, aList);
		bd.lancarNota(16, 124);
		createDisciplinaFile("Estudantes.txt", "bd.txt").toPrint();;
		
//		poo.inscrever(a);
//		poo.inscrever(b);
//		poo.inscrever(c);
//		poo.lancarNota(12, 123);
//		poo.lancarNota(16, 124);
//		poo.lancarNota(17, 125);
//		poo.notaMedia();
//		poo.toFile(poo);
		
//		bd.toFile("bd.txt");
	}
}
