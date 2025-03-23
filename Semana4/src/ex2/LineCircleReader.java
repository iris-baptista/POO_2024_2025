package ex2;

import java.io.File;

public class LineCircleReader extends LineObjectReader<Circle>{

	public LineCircleReader(File file) {
		super(file);
	}

	@Override
	public Circle lineToObject(String line) {
		int r = Integer.parseInt(line);
		Circle c = new Circle(r);
		return c;
	}

}
