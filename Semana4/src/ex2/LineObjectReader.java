package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class LineObjectReader<T> {
	private File file;
	
	public LineObjectReader(File file) {
		this.file = file;
	}
	
	public List<T> read() throws FileNotFoundException { 
		List<T> objects = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				T object = lineToObject(line);
				if(object != null)
					objects.add(object);
			}
			scanner.close();
		}
		catch(FileNotFoundException e){
			System.err.println("Falha ao abrir ficheiro");
		}
		return objects;
	}
	
	public abstract T lineToObject(String line);
}
