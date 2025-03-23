package charcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharCounter {
	
	public static int charCounter(String fileName, char m) {
		int counter = 0;
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
				String s = scanner.next();
				for(int i = 0; i < s.length(); i++)
					if(s.charAt(i) == m)
						counter++;
			}
			scanner.close();
		} catch(FileNotFoundException e) {
			System.err.println("Ficheiro " + fileName + " não encontrado.");
		}
		return counter;
	}
	
	public static void main(String[] args) {
		int troll = charCounter("zebomb.txt", '3');
		System.out.println(troll);
	}
}
