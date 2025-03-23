package disciplinas;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Aluno {
	private int numero;
	private String nome;

	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}	
	
	// 2.2
	public static ArrayList<Aluno> list(String fileName) { //COMPLETED AND WORKING (TESTED)
		ArrayList<Aluno> aList = new ArrayList<Aluno>();
		try {
			Scanner sc = new Scanner(new File(fileName));
			while(sc.hasNextLine()) {
				int num = sc.nextInt();
				String name = sc.nextLine().trim();
				Aluno a = new Aluno(num, name);
				aList.add(a);
			}	
			sc.close();	
		}
		catch(FileNotFoundException e) {
			System.err.println("Erro a criar ficheiro");
		}
			
		return aList;
	}
	
	public static void main(String[] args) {
		list("Estudantes.txt");
	}
}
