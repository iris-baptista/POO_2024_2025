package ex1;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	private List<AbstractFigure> list;
	
	public Canvas() {
		this.list = new ArrayList<>();
	}
	
	// i)
	public void add(AbstractFigure f) {
		list.add(f);
	}
	
	// ii)
	public AbstractFigure greatestArea() {
		if(list.size() == 0)
			return null;
		double area = 0;
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getArea() > area) {
				area = list.get(i).getArea();
				index = i;
			}
		}
		AbstractFigure fig = list.get(index);
		return fig;
	}
	
	// iii)
	public void removeGreatest() {
		if(list.size() == 0)
			throw new IllegalStateException("Lista vazia!");
		list.remove(greatestArea());
	}
	
	// iv)
	public double totalArea() {
		double total = 0;
		for(int i = 0; i < list.size(); i++)
			total = total + list.get(i).getArea();
		return total;
	}
	
	public static void main(String[] args) {
		Canvas c = new Canvas();
		c.add(new Rectangle(0,0,5,6));
		c.add(new Rectangle(0,0,7,3));
		c.add(new Circle(0,0,4));
		
		System.out.println(c.greatestArea()); 
		System.out.println(c.totalArea());
		c.removeGreatest();
		System.out.println(c.greatestArea());
		System.out.println(c.totalArea());
		
		for(AbstractFigure fig : c.list)
			System.out.println(fig);
	}
}
