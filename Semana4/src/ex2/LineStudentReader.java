package ex2;

import java.io.File;

public class LineStudentReader extends LineObjectReader<Student>{

	public LineStudentReader(File file) {
		super(file);
	}	
	
	@Override
	public Student lineToObject(String line) {
		String[] words = line.split(" ");
		int numero = Integer.parseInt(words[0]);
		String nome = words[1] + " ";
		for(int i = 2; i < words.length; i++)
			nome = nome + words[i];
		Student stu = new Student(nome, numero);
		return stu;
	}

}
