package playlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Playlist implements FiltroDeMusicas{
	private String nome;
	private List<Music> musicas;
	
	public String getNome() {
		return this.nome;
	}
	
	public void adicionar(Music m) {
		musicas.add(m);
	}
	
	public void lerMusicas(String fileName) {
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
//				String[] info = scanner.nextLine().split(";");
				String[] autores = scanner.nextLine().split(";");
				if(autores.length != 1) {
					
				}
					
			}
			scanner.close();
				
		}
		catch(FileNotFoundException e) {
			System.err.println("Erro a abrir ficheiro");
		}
	}
	
	public void ordenarMusicas(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public boolean excluir(Music m) {
		return musicas.remove(m);
	}
}
