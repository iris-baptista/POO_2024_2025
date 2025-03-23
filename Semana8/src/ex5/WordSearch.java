package ex5;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSearch {
	
	public static void main(String[] args){
        if (args.length < 3) {
            System.err.println("Tem que ter 3 argumentos e o primeiro tem que ser o ficheiro");
            return;
        }
        
        String start = args[1].toLowerCase();
        String end = args[2].toLowerCase();
        
        if (start.compareTo(end) >= 0) {
            System.err.println("Erro: A palavra inicial deve ser menor que a palavra final.");
            return;
        }

        try {
        	Scanner scanner = new Scanner(new File(args[0]), "UTF-8");
            scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");

            SortedSet<String> words = new TreeSet<>();
            
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                if (word.length() > 3) {
                    words.add(word);
                }
            }

            // start é inclusivo, end é exclusivo
            SortedSet<String> result = words.subSet(start, end);

            result.forEach(e -> System.out.println(e));
            scanner.close();
        }
        catch (FileNotFoundException e) {
        	System.err.println("Erro a abrir ficheiro " + args[0] + ".");
        }
    }
}
