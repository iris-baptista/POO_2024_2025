package ex4;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File(args[0]), "UTF-8");
			scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");
			
			SortedSet<String> words = new TreeSet<>();
			
			while(scanner.hasNext()) {
				String word = scanner.next().toLowerCase();
				if(word.length() > 0){
					words.add(word);
				}
			}	
			
			System.out.println("Total de palavras distintas: " + words.size());
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("Erro a abrir o ficheiro " + args[0] + ".");
		}
	}
}
